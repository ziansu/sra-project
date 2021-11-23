public T pop() {
    T result = peek();
    stack[((stack.length) - (index))] = null;
    (count)--;
    checkSizeAfterPop();
    return result;
}