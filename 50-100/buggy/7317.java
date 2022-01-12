public java.lang.String textReturnResultOfSpecialFunctions(int line, int pos) {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    if ((this.stackOfSpecialFunctionsCalledRecursively.size()) > 0) {
        this.stackOfSpecialFunctionsCalledRecursively.removeLast();
    }
    java.lang.String res = nextFreeRegister();
    s.append(textMove("$v0", res, line, pos));
    return s.toString();
}