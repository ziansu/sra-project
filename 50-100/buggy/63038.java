public static void remove(int index, java.util.ArrayList<java.lang.String> list) {
    if (index >= (list.size())) {
        java.lang.System.out.printf("%d is too large. Last index is %d.\n", index, list.size());
    }else {
        java.lang.System.out.printf("Removed %s.\n", list.remove(index));
    }
}