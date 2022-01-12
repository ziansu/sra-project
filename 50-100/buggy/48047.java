public java.lang.Integer[] getChildren() {
    if ((children) == null) {
        page.getByteBuffer().position(ru.spbau.mit.memory.page.InnerNodePageImpl.CHILDREN_OFFSET);
        children = new java.lang.Integer[(CHILDREN_CAPACITY) + 1];
        for (int i = 0; i < ((getSize()) + 1); i++) {
            children[i] = page.getByteBuffer().getInt();
        }
    }
    return children;
}