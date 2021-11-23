public static <T> void quickRemove(java.util.List<T> list, int index) {
    int end = (list.size()) - 1;
    T last = list.remove(end);
    if (index != end)
        list.set(index, last);
    
}