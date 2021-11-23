public boolean hasMill(Token t) {
    java.util.List<Mill> theMills = findMills(t);
    for (Mill m : theMills) {
        if (m.isFull()) {
            return true;
        }
    }
    return false;
}