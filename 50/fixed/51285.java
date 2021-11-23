public int pop() {
    if (isEmpty()) {
        return STACK_EMPTY;
    }
    return items[(--(total))];
}