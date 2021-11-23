public void add(T value) {
    if (empty) {
        this.value = value;
        empty = false;
    }else
        if ((next) == null) {
            next = new list.LinkedList<>(value);
        }else {
            next.add(value);
        }
    
}