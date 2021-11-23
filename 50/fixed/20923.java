public spade.storage.kafka.Edge.Builder setChildVertexHash(java.lang.String value) {
    validate(fields()[1], value);
    this.childVertexHash = value;
    fieldSetFlags()[1] = true;
    return this;
}