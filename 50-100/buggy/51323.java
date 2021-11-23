public static <T> void addArrayToList(java.util.List<T> list, T[] array) {
    if (com.jingsky.util.common.CollectionUtil.isEmpty(list)) {
        return ;
    }
    for (T t : array) {
        list.add(t);
    }
}