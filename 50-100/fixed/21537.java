private boolean redUncle(collection.TreeMultiset.Node<E> child, collection.TreeMultiset.Node<E> uncle) {
    if (((uncle != null) && (!(uncle.isBlack))) || ((child.parent.isBlack) && ((uncle == null) || (uncle.isBlack)))) {
        child.parent.isBlack = true;
        child.parent.parent.isBlack = false;
        uncle.isBlack = true;
        recolorAdd(child.parent.parent);
        return true;
    }
    return false;
}