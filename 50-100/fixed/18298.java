private void put(java.lang.Object obj) {
    if (obj == null)
        return ;
    
    boolean success = true;
    do {
        java.lang.Object minVal = min.get();
        if ((minVal == null) || ((comp.compare(minVal, obj)) > 0))
            success = min.compareAndSet(minVal, obj);
        else
            break;
        
    } while (!success );
}