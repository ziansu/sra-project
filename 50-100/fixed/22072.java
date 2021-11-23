@java.lang.Override
protected void endRender() {
    int start = 5;
    int numElements = (4 * 2) + 2;
    for (int i = 0; i < numElements; i++) {
        glDisableVertexAttribArray((start + i));
    }
    super.endRender();
}