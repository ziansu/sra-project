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
    
    (count)--;
    RBTree<E>.RBNode toDelete = find(item);
    removeHelper(toDelete);
    return toDelete != null;
}