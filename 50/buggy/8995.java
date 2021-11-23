private final int indexOfForName() {
    if (!(hasParent()))
        return 0;
    
    return getParent().indexOfForName(this);
}