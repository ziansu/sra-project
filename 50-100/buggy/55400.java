@java.lang.Override
protected void init(java.lang.String[] fields) {
    if (((((fields[0]) == null) || (fields[0].isEmpty())) || ((fields[1]) == null)) || (fields[1].isEmpty())) {
        throw new com.poesys.db.InvalidParametersException(com.poesys.accounting.dataloader.oldaccounting.AccountMap.NULL_PARAMETER_ERROR);
    }
    this.accountNumber = new java.lang.Float(fields[0]);
    this.name = fields[1];
}