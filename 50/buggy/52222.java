public boolean hasMill(Token t) {
    boolean result = false;
    java.util.List<Mill> theMills = findMills(t);
    for (Mill m : theMills) {
        if (m.isFull()) {
            return true;
        }
    }
    return result;
}