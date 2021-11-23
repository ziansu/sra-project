public void div(final int... params) {
    int divResult = params[0];
    for (int i = 1; i < ((params.length) - 1); i++) {
        divResult /= params[i];
    }
    result += divResult;
}