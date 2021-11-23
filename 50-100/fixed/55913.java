@java.lang.Override
public java.lang.String arrayToString(int[] array) {
    java.lang.StringBuilder result = new java.lang.StringBuilder("");
    for (int i = 0; i < ((array.length) - 1); i++) {
        result.append(java.lang.String.format("%d, ", array[i]));
    }
    result.append(java.lang.String.format("%d", array[((array.length) - 1)]));
    return java.lang.String.format("{%s}", result);
}