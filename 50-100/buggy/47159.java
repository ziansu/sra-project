public void removeNull(java.util.List<T> list) {
    java.util.Iterator<T> iterator = list.iterator();
    while (iterator.hasNext()) {
        T t = iterator.next();
        if (t == null)
            iterator.remove();
        
    } 
}