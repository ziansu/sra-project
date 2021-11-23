@java.lang.Override
protected void initRender() {
    super.initRender();
    int start = 5;
    int numElements = (4 * 2) + 1;
    for (int i = 0; i < numElements; i++) {
        glEnableVertexAttribArray((start + i));
    }
}