public static int getIndex(final java.lang.String[] arr, final java.lang.String val) {
    for (int i = 0; i < (arr.length); i++) {
        if (val.equalsIgnoreCase(arr[i])) {
            return i;
        }
    }
    return -1;
}