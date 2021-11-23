public boolean find(java.lang.String name) {
    boolean contains = false;
    placeHolder = head;
    for (int i = 0; i < ((size) - 1); i++) {
        int equals = placeHolder.getName().compareToIgnoreCase(name);
        if (equals == 0)
            contains = true;
        
        placeHolder = placeHolder.getNext();
    }
    return contains;
}