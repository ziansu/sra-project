public static java.lang.String printArray(java.util.ArrayList<java.lang.String> arr, boolean pretty) {
    java.lang.String s = "";
    for (int i = 0; i < (arr.size()); i++) {
        s += (arr.get(i)) + " ";
    }
    return s;
}