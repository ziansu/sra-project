protected void addRelatedEntity(final java.lang.String name, final java.lang.Class type, final java.lang.String order) {
    this.relations.put(name, type);
    this.ordering.put(name, order);
}