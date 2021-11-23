private void inflate() {
    Item[] item = ((Item[]) (new java.lang.Object[(size) * 2]));
    java.lang.System.arraycopy(stack_space, 0, item, 0, size);
    stack_space = item;
}