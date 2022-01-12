public java.lang.Object peekMin() {
    java.lang.Object temp = ((java.lang.Comparable) (queue.get(0)));
    for (int i = 1; i < (queue.size()); i++) {
        if ((temp.compareTo(queue.get(i))) > 0) {
            temp = ((java.lang.Comparable) (queue.get(i)));
        }
    }
    return temp;
}