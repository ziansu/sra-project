public D peekFirst() {
    if (!(isEmpty())) {
        return ((D) (_front.toString()));
    }
    return null;
}