public Item pop() {
    if (isEmpty()) {
        throw new java.lang.RuntimeException("Stack is Empty!");
    }
    Item s = items[(--(index))];
    items[index] = null;
    if (((index) > 0) && ((index) == ((items.length) / 4))) {
        java.lang.System.out.println("\n\tShrinking stack array size.");
        resize(((items.length) / 2));
    }
    return s;
}