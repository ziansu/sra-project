public boolean isClosed() {
    return ((selector) == null) || (!(selector.isOpen()));
}