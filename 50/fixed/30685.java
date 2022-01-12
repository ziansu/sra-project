public void push(java.lang.String item) {
    if ((size) == (arr.length)) {
        resize((2 * (arr.length)));
    }
    arr[((size)++)] = item;
}