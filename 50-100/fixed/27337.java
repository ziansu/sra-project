public int size() {
    int size = 0;
    if ((root) == null) {
        size = 0;
    }else
        if ((root.children.size()) == 0) {
            size = 1 + (root.children.size());
        }else {
            size = 1 + (size());
        }
    
    return size;
}