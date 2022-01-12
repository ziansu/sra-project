private int[] rightHalf(int[] array) {
    int size1 = (array.length) / 2;
    int size2 = (array.length) - size1;
    int[] right = new int[size2];
    java.lang.System.arraycopy(array, size1, right, 0, size2);
    return right;
}