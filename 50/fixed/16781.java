public void unparent() {
    if ((parent) != null) {
        disableParentControl();
        parent.removeChildFromChildren(this);
        parent = null;
    }
}