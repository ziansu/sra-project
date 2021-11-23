@java.lang.Override
public boolean isFull() {
    if (full)
        return true;
    else
        full = (this.sz.get()) >= (maxSz);
    
    return full;
}