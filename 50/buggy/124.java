public void invalidate() {
    if (!(invalidateParent()))
        super.invalidate();
    else
        getParent().invalidate();
    
}