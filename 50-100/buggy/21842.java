public boolean[] binaryRep() {
    java.lang.String bin = java.lang.Integer.toBinaryString(size);
    int length = bin.length();
    boolean[] arr = new boolean[length];
    for (int i = length - 1; i >= 0; i--) {
        arr[((length - 1) - i)] = ((bin.charAt(i)) == '1') ? true : false;
    }
    return arr;
}