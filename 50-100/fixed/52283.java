public void free() {
    if ((data.size()) >= (reserved))
        dispose(value);
    else {
        clear(value);
        data.add(this);
    }
    if ((next) != null)
        next.free();
    
    next = null;
    length = 0;
}