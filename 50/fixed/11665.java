public java.lang.Integer peekMin() {
    if ((_heap.size()) < 1)
        return null;
    else
        return _heap.get(0);
    
}