public void add(Item item) {
    if (!(contains(item)))
        head = new Bag.Node<Item>(item, head);
    
}