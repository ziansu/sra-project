public void renumberDeductions() {
    int i = 0;
    for (erp.mod.hrs.db.SHrsPayrollReceiptDeduction deduction : maHrsDeductions) {
        deduction.setPkMoveId((++i));
    }
}