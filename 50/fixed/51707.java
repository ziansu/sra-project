public void push(java.lang.Object item) {
    if (internalList.isEmpty()) {
        internalList.add(item);
    }else {
        internalList.add(0, item);
    }
}