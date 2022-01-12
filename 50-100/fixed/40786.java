public void mult(final int... params) {
    int multResult = params[0];
    for (int i = 1; i < (params.length); i++) {
        multResult *= params[i];
    }
    result += multResult;
}