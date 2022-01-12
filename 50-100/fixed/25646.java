private int[] leftHalf(int[] array) {
    int size1 = (array.length) / 2;
    int[] left = new int[size1];
    java.lang.System.arraycopy(array, 0, left, 0, size1);
    return left;
}