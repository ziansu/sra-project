public static java.lang.Integer[] clone(java.lang.Integer[] intArray) {
    java.lang.Integer[] ret = new java.lang.Integer[intArray.length];
    for (int i = 0; i < (intArray.length); i++) {
        ret[i] = java.lang.Integer.valueOf(intArray[i]);
    }
    return ret;
}