public void sub(final int... params) {
    int subResult = params[0];
    for (int i = 1; i < ((params.length) - 1); i++) {
        subResult -= params[i];
    }
    result += subResult;
}