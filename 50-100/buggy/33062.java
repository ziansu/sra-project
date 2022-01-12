public java.lang.String perform(java.util.Scanner in) throws java.lang.Exception {
    int firstNumber = readNumber(in);
    int secondNumber = readNumber(in);
    java.lang.System.err.println(("firstNumber : " + firstNumber));
    java.lang.System.err.println(("secondNumber: " + secondNumber));
    int result = getResult(in, firstNumber, secondNumber);
    java.lang.System.err.println(("result: " + result));
    java.lang.StringBuffer strBuf = new java.lang.StringBuffer();
    return display(result, strBuf);
}