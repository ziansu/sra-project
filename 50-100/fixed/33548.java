public boolean remove(E e) {
    java.util.Objects.requireNonNull(e);
    if (e.isRegistered()) {
        e.setRegistered(false);
        e.dispose();
        characters[e.getSlot()] = null;
        lastSlot = e.getSlot();
        (size)--;
        return true;
    }
    return false;
}