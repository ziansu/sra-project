public void printRecVoidItem(java.lang.String description, long amount, int quantity, int adjustmentType, long adjustment, int vatInfo) throws java.lang.Exception {
    openReceipt(PrinterConst.SMFP_RECTYPE_RETSALE);
    if (isSaleReceipt()) {
        printStorno(0, quantity, amount, getParams().department, vatInfo, description);
    }else {
        printSale(0, quantity, amount, getParams().department, vatInfo, description);
    }
}