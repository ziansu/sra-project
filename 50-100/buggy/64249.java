public void enqueue(Item item) {
    if ((size()) == (items.length))
        resize(((items.length) * 2));
    
    if ((size()) == 0) {
        items[0] = item;
        head = 0;
        tail = 0;
    }else {
        items[(++(tail))] = item;
    }
}