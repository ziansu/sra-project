public static java.lang.String[] getPartsCounter(int max) {
    java.lang.String[] counter = new java.lang.String[max];
    for (int i = 0; i < max; i++) {
        counter[i] = (i + 1) + "";
    }
    return counter;
}