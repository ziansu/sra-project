protected int getIndex(final java.lang.String name) {
    java.lang.Integer index = this.nameIndices.get(name);
    if (index == null) {
        index = this.nameIndices.size();
        this.nameIndices.put(name, index);
    }
    return index;
}