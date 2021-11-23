private void ensureCapacity() {
    if (((index) + 1) > (capacity))
        transfer();
    
}