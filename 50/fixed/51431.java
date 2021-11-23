public structures.Node findRepresentative() {
    if ((representative) == null) {
        return this;
    }
    return representative.findRepresentative();
}