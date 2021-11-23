public void toggle(int i) {
    if ((i < (flags.size())) && (i >= 0))
        flags.set(i, (!(flags.get(i))));
    
}