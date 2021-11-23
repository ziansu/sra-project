public void jump(int delta) {
    int index = (hIndex) + delta;
    index = java.lang.Math.max(0, index);
    if (index >= (history.size())) {
        while ((index >= (history.size())) && (extend())) {
        } 
    }else {
        hIndex = index;
    }
}