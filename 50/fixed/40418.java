private boolean isGeneric() {
    if ((_parent) == null) {
        return false;
    }
    return ((_parent.getWidth()) == 1) && ((_parent.getHeight()) == 1);
}