public void remove() {
    if ((parent) == null) {
        root = null;
        return ;
    }
    parent.children.remove(this);
    if (parent.children.isEmpty()) {
        parent.remove();
    }else {
        parent.computeMBR();
    }
}