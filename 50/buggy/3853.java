private boolean hasRoom(edu.wit.dcsn.comp2000.GroceryItem item) {
    checkInitialization();
    return ((spaceLeft) > (item.getSize().sizeValue)) && ((weightLeft) > (item.getWeight().weightValue));
}