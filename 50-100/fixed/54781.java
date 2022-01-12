public void add(int e) {
    if (!(hasRoot)) {
        heap.set(1, e);
        hasRoot = true;
    }else
        if (isMax) {
            addMax(e);
        }else {
            addMin(e);
        }
    
}