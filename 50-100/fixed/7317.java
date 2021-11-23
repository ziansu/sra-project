public java.lang.String textReturnResultOfSpecialFunctions(int line, int pos) {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    java.lang.String res = nextFreeRegister();
    s.append(textMove("$v0", res, line, pos));
    return s.toString();
}