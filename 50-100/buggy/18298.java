private void put(java.lang.Object obj) {
    boolean success = true;
    do {
        java.lang.Object minVal = min.get();
        if ((minVal == null) || (((comp.compare(minVal, obj)) > 0) && (obj != null)))
            success = min.compareAndSet(minVal, obj);
        
    } while (!success );
}