public boolean remove(E item) {
    if (item == null) {
        return false;
    }
    if (isEmpty()) {
        return false;
    }else
        if (!(contains(item))) {
            return false;
        }
    
    RBTree<E>.RBNode toFix;
    RBTree<E>.RBNode toDelete = find(item);
    toFix = removeHelper(toDelete);
    fixRemove(toFix);
    return toDelete != null;
}