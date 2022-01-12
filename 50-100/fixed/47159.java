public void removeNull(java.util.List<T> list) {
    if (list == null) {
        list = new java.util.ArrayList<T>();
    }
    java.util.Iterator<T> iterator = list.iterator();
    while (iterator.hasNext()) {
        T t = iterator.next();
        if (t == null)
            iterator.remove();
        
    } 
}