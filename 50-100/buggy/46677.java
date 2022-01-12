protected java.lang.String getParams() {
    int length = vars.length;
    assert length > 0;
    java.lang.StringBuilder params = new java.lang.StringBuilder();
    for (int i = 1; i < (length - 1); i++) {
        params.append(((vars[i]) + ","));
    }
    if (length > 0) {
        params.append(vars[(length - 1)]);
    }
    return params.toString();
}