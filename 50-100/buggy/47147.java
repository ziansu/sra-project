public java.lang.String grossFormula() {
    dispatcher.setSessionID();
    int gf = -1;
    try {
        gf = com.epam.indigo.Indigo.checkResult(this, _lib.indigoGrossFormula(self));
        java.lang.String result = com.epam.indigo.Indigo.checkResultString(this, _lib.indigoToString(gf));
        return result;
    } finally {
        _lib.indigoFree(gf);
    }
}