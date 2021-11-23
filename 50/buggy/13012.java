public int getIndex(T proxy) {
    for (int i = 0; i < (getSize()); ++i) {
        if (proxy == (getProxy(i)))
            return i;
        
    }
    return -1;
}