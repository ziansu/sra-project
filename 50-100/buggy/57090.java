public static void shrink(java.util.List list, int size) {
    if ((list.size()) > size) {
        for (int i = size; i < (list.size()); i++) {
            list.remove(i);
        }
    }
}