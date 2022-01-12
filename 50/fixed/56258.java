public T get(long selector) {
    int index = ((int) (selector % (elementIndex.length)));
    index = elementIndex[index];
    return elements.get(index);
}