public void remove(double v) {
    if ((root) != null) {
        if ((root.getValue()) == v) {
            root.removeNode(v, null);
            root = null;
        }else {
            root.removeNode(v, null);
        }
    }
    if (((size) - 1) < 0) {
        size = 0;
    }else {
        size -= 1;
    }
}