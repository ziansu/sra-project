public static java.lang.String arrayToString(java.lang.String[] array) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (array.length); i++) {
        if (i == (array.length)) {
            sb.append(array[i]);
        }else {
            sb.append(((array[i]) + ","));
        }
    }
    return sb.toString();
}