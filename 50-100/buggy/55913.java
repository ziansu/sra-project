@java.lang.Override
public java.lang.String arrayToString(int[] array) {
    java.lang.StringBuffer result = new java.lang.StringBuffer("");
    for (int i = 0; i < ((array.length) - 1); i++) {
        result.append(java.lang.String.format("%d, ", array[i]));
    }
    result.append(java.lang.String.format("%d", array[((array.length) - 1)]));
    return java.lang.String.format("{%s}", result);
}