private void put(java.lang.Object obj) {
    boolean success = true;
    do {
        java.lang.Object maxVal = max.get();
        if ((maxVal == null) || ((comp.compare(maxVal, obj)) < 0))
            success = max.compareAndSet(maxVal, obj);
        
    } while (!success );
}