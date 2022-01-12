private static char[] processSpaces(char[] cbuf) {
    java.lang.String allBuff = java.lang.String.valueOf(cbuf);
    allBuff = allBuff.replaceAll("\t", Printer.TAB_SPACE);
    allBuff = allBuff.replaceAll("\r\n", "\n");
    return allBuff.toCharArray();
}