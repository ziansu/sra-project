public static <T> void addArrayToList(java.util.List<T> list, T[] array) {
    if (com.jingsky.util.common.CollectionUtil.isEmpty(array)) {
        return ;
    }
    if (list == null) {
        list = new java.util.ArrayList<T>();
    }
    for (T t : array) {
        list.add(t);
    }
}