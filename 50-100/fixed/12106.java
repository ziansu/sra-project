public static java.util.List<java.lang.Integer> shuffle(java.util.List<?> list, int count) {
    java.util.List<java.lang.Integer> listClone = new java.util.ArrayList<>();
    for (int i = 0; i < (list.size()); ++i) {
        listClone.add(i);
    }
    if ((list.size()) == count) {
        return listClone;
    }
    java.util.Collections.shuffle(listClone);
    return listClone.subList(0, count);
}