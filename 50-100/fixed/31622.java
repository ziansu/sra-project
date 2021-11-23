public final simple.parser.ml.Tag removeAllChildren() {
    synchronized(sync) {
        for (int index = (children.size()) - 1; index >= 0; index--) {
            fireChildRemoved(children.remove(index).setParent(null));
        }
    }
    return this;
}