public boolean remove(E e) {
    java.util.Objects.requireNonNull(e);
    if (e.isRegistered()) {
        e.dispose();
        e.setRegistered(false);
        characters[e.getSlot()] = null;
        lastSlot = e.getSlot();
        (size)--;
        return true;
    }
    return false;
}