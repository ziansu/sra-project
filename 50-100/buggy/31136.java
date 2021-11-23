public static int getInputNum(java.lang.String inputArgs) {
    java.lang.String[] inputTokens = inputArgs.split(Parser.InputNumParser.REGEX_SPACE);
    java.lang.String inputNum = inputTokens[0];
    int num;
    try {
        num = java.lang.Integer.parseInt(inputNum);
    } catch (java.lang.Exception e) {
        num = -1;
    }
    if (num < 1) {
        num = -1;
    }
    return num;
}