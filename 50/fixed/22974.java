public void putInBag(Bag bag) {
    bagIn = bag;
    if (bag != null) {
        bag.addItem(this);
    }
}