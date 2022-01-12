private void computeReceiptValue() {
    mdEarningsExemption_r = 0;
    mdEarningsTaxable_r = 0;
    mdEarnings_r = 0;
    mdDeductions_r = 0;
    for (erp.mod.hrs.db.SDbPayrollReceiptEarning earning : maChildPayrollReceiptEarnings) {
        mdEarningsExemption_r += earning.getAmountExempt();
        mdEarningsTaxable_r += earning.getAmountTaxable();
        mdEarnings_r += earning.getAmount_r();
    }
    for (erp.mod.hrs.db.SDbPayrollReceiptDeduction deduction : maChildPayrollReceiptDeductions) {
        mdDeductions_r += deduction.getAmount_r();
    }
    mdPayment_r = (mdEarnings_r) - (mdDeductions_r);
}