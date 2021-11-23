public void push(java.lang.String item) {
    if ((size) == (arr.length)) {
        resize((2 * (size)));
    }
    arr[((size)++)] = item;
}