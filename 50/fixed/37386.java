public void push(java.lang.Object item) {
    if (isEmpty()) {
        list.add(item);
    }else {
        list.add(0, item);
    }
}