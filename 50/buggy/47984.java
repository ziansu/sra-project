private void checkItem() {
    if (((worker.holding) != null) && (needsMaterial)) {
        if (worker.holding.equals(material)) {
            hasMaterial = true;
        }
    }
}