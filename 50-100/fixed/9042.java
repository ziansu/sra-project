private void validateHeader(final java.lang.String[] headers) throws java.io.IOException {
    if (headers == null) {
        throw new org.milyn.csv.CSVHeaderValidationException(getFieldNames(fields));
    }
    if (validateHeader(fields, headers)) {
        return ;
    }
    throw new org.milyn.csv.CSVHeaderValidationException(getFieldNames(fields), headers);
}