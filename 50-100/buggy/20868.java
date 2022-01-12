static void callMethod(java.lang.String name) throws java.io.IOException {
    if (Jude.PRINT.equals(name)) {
        Jude.callPrint();
        return ;
    }
    if (Jude.PRINTLN.equals(name)) {
        Jude.callPrintln();
        return ;
    }
    Jude.pushProcReg(name);
    Jude.paramList(name);
    Jude.call(name);
    Jude.popProcReg(name);
}