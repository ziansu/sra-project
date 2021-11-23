public java.lang.String[] getKeysInvoice(com.sage.accpac.sm.Program program, java.lang.String batch) {
    com.sage.accpac.sm.View invoices = new com.sage.accpac.sm.View(program, "AR0032");
    int count = 0;
    while (invoices.goNext()) {
        if (invoices.get("CNTBTCH").equals(batch)) {
            return invoices.getDefiningKeyValues();
        }
    } 
    java.lang.System.out.println(count);
    return null;
}