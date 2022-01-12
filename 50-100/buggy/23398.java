public void add(final int... params) {
    int addResult = params[0];
    for (int i = 1; i < ((params.length) - 1); i++) {
        addResult += params[i];
    }
    result += addResult;
}