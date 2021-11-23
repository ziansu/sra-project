public com.github.tamir7.contacts.Query transform(com.github.tamir7.contacts.ContactTransformer transformer) {
    if (transformer != null) {
        this.transformer = transformer;
    }
    return this;
}