public T pop() {
    T result = peek();
    stack[((count) - 1)] = null;
    (count)--;
    checkSizeAfterPop();
    return result;
}