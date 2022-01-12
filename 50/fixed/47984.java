private void checkItem() {
    if (((!(hasMaterial)) && ((worker.holding) != null)) && (needsMaterial)) {
        if (worker.holding.equals(material)) {
            hasMaterial = true;
        }
    }
}