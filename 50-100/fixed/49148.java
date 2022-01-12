public T[] pop(int numberOfItems) {
    T[] items = ((T[]) (new java.lang.Object[numberOfItems]));
    T item = this.pop();
    int position = 0;
    while ((position < numberOfItems) && (item != null)) {
        items[position] = item;
        position++;
        item = this.pop();
    } 
    return items;
}