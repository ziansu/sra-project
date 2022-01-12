public void push(Item item) {
    if ((size) == (arr.length)) {
        resize((2 * (arr.length)));
    }
    arr[((size)++)] = item;
}