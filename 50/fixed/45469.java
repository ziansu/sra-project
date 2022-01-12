public T findMax() {
    if (isEmpty()) {
        throw new java.nio.BufferUnderflowException();
    }
    return findMax(root).element;
}