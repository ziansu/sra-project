public void clear() {
    network.clearall();
    for (java.lang.Character ch : characters) {
        ch.setIsAdded(1, 1, false, true);
    }
}