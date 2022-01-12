public final simple.parser.ml.Tag removeAllChildren() {
    synchronized(sync) {
        for (int index = 0; index < (children.size()); index++) {
            fireChildRemoved(children.pop().setParent(null));
        }
    }
    return this;
}