public static boolean antiCheese(int id, java.util.List<java.lang.Integer> list) {
    for (int i = 0; i < (list.size()); i++) {
        if (id == (list.get(i))) {
            return false;
        }
    }
    return true;
}