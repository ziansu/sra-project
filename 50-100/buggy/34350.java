public static <T> java.util.ArrayList<T> getUniqueList(java.util.ArrayList<T> list) {
    java.util.ArrayList<T> uniqueList = new java.util.ArrayList<T>();
    for (int i = 0; i < (list.size()); i++) {
        T element = list.get(i);
        if (!(uniqueList.contains(element))) {
            uniqueList.add(element);
        }
    }
    return uniqueList;
}