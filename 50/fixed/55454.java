public boolean canRemove(Card makesRemovable) {
    if ((index) == (-1))
        return false;
    
    if (column[index].canRemove(makesRemovable)) {
        return true;
    }
    return false;
}