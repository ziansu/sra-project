public static void insert(java.lang.String arg, int index, java.util.ArrayList<java.lang.String> list) {
    if (index >= (list.size())) {
        java.lang.System.out.printf("Index %d is too large. Last index is %d.\n", index, list.size());
    }else {
        list.add(index, arg);
    }
}