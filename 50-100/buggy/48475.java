public void remove(java.util.function.LongConsumer item) {
    int size = list.length;
    int idx = 0;
    while ((idx < size) && ((list.get(idx).item) != item))
        idx++;
    
    if (idx < size)
        list.remove(item);
    
}