private void validateHeader(final org.milyn.csv.CSVReader reader) throws java.io.IOException {
    java.lang.String[] headers = reader.readNext();
    if (headers == null) {
        throw new org.milyn.csv.CSVHeaderValidationException(getFieldNames(fields));
    }
    if (validateHeader(fields, headers)) {
        return ;
    }
    throw new org.milyn.csv.CSVHeaderValidationException(getFieldNames(fields), headers);
}