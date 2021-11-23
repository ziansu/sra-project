@java.lang.Override
protected void init(java.lang.String[] fields) {
    capitalAccountName = fields[0];
    if (((capitalAccountName) == null) || (capitalAccountName.isEmpty())) {
        throw new com.poesys.db.InvalidParametersException(NULL_PARAMETER_ERROR);
    }
    distributionAccountName = fields[1];
    if (fields[2].isEmpty()) {
        ownership = 1.0;
    }else {
        ownership = new java.lang.Double(fields[2]);
    }
}