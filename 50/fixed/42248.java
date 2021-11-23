private void normalizeLimit() throws com.stratio.crossdata.common.exceptions.validation.BadFormatException {
    if ((parsedQuery.getStatement().getLimit()) < 1) {
        throw new com.stratio.crossdata.common.exceptions.validation.BadFormatException("Limit must be a positive number.");
    }
}