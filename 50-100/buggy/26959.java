public static java.lang.String printArray(java.util.ArrayList<java.lang.String> arr, boolean pretty) {
    java.lang.String s = "";
    for (int i = 0; i < (arr.size()); i++) {
        if (pretty && (arr.get(i).equals("\n"))) {
            java.lang.System.out.print(arr.get(i));
            continue;
        }
        s += (arr.get(i)) + " ";
    }
    return s;
}