public void remove(java.util.function.LongConsumer action) {
    int size = list.size();
    int idx = 0;
    while ((idx < size) && ((list.get(idx).getAction()) != action))
        idx++;
    
    if (idx < size)
        list.remove(idx);
    
}