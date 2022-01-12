public T largest(java.util.ArrayList<T> list) {
    T largest = list.get(0);
    for (T item : list) {
        if ((item.toString().compareTo(largest.toString())) > 0) {
            largest = item;
        }
    }
    return largest;
}