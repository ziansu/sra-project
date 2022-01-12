public static int getXIndex(java.lang.String variable) {
    int XPos = variable.indexOf("X");
    if (XPos == (-1)) {
        return -1;
    }
    return java.lang.Integer.parseInt(variable.substring((XPos + 1)));
}