public static <T> java.util.ArrayList<T> getUniqueList(java.util.ArrayList<T> list) {
    java.util.ArrayList<T> uniqueList = new java.util.ArrayList<T>();
    for (T element : list) {
        if (!(uniqueList.contains(element))) {
            uniqueList.add(element);
        }
    }
    return uniqueList;
}