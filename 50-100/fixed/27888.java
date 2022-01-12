private static java.lang.String[] reverse(java.lang.String[] arr) {
    java.lang.String[] rarr = new java.lang.String[0];
    if (arr != null) {
        rarr = new java.lang.String[arr.length];
        int j = 0;
        for (int i = (arr.length) - 1; i >= 0; i--) {
            rarr[(j++)] = arr[i];
        }
    }
    return rarr;
}