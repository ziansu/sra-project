public java.lang.String dec2bin(java.lang.String decimal) {
    if (decimal == null) {
        decimal = "1";
    }
    debugprintln(((("[line " + (org.fosstrak.tdt.TDTEngine.getLineNumber())) + "] decimal = ") + decimal));
    if ((decimal.length()) == 0) {
        return "0";
    }else {
        java.math.BigInteger bin = new java.math.BigInteger(decimal);
        return bin.toString(2);
    }
}