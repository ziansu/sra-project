public MiniJavaVar findVar(java.lang.String varName) {
    int n = contexts.size();
    for (n -= 1; n >= 0; n--) {
        MiniJavaVar findRes = contexts.get(n).vars.get(varName);
        if (findRes != null) {
            return findRes;
        }
    }
    return null;
}