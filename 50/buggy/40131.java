public boolean hasInstance(int index) {
    if (index >= (instances.size())) {
        return false;
    }
    return (instances.get(index)) != null;
}