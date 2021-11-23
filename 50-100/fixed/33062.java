public java.lang.String perform(java.util.Scanner in) throws java.lang.Exception {
    long firstNumber = readNumber(in);
    long secondNumber = readNumber(in);
    long result = getResult(in, firstNumber, secondNumber);
    java.lang.StringBuffer strBuf = new java.lang.StringBuffer();
    return display(result, strBuf);
}