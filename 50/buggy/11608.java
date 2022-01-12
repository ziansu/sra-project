org.cojen.tupl.TreeCursorFrame pop() {
    unbind();
    org.cojen.tupl.TreeCursorFrame parent = mParentFrame;
    mNode = null;
    mParentFrame = null;
    mNotFoundKey = null;
    return parent;
}