public void clear() {
    java.util.Iterator<java.util.ArrayDeque> it = micarray.iterator();
    while (it.hasNext())
        it.next().clear();
    
}