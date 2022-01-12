@java.lang.Override
protected void init(java.lang.String[] fields) {
    this.accountNumber = new java.lang.Float(fields[0]);
    this.name = fields[1].trim();
    if (fields[2].equalsIgnoreCase("DR")) {
        this.defaultDebit = true;
    }else {
        defaultDebit = false;
    }
}