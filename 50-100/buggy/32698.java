public static int compare(java.lang.String[] srcVersionArray, java.lang.String[] destVersionArray, int type) {
    for (int j = srcVersionArray.length; j < (destVersionArray.length); j++) {
        if ((java.lang.Integer.parseInt(destVersionArray[j])) > 0) {
            return type;
        }
    }
    return 0;
}