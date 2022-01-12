private void printByteArrLast(byte[] arr, int len) {
    if ((arr == null) || ((arr.length) == 0)) {
        return ;
    }
    for (int i = 0; i < len; i++) {
        java.lang.System.out.print(arr[(((arr.length) - 1) - i)]);
    }
    java.lang.System.out.println();
}