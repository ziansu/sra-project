public me.tatarka.parsnip.XmlWriter namespace(me.tatarka.parsnip.Namespace namespace) throws java.io.IOException {
    if ((state) == (me.tatarka.parsnip.XmlWriter.STATE_TAG)) {
        declareNamespace(namespace);
    }else
        if (((state) == (me.tatarka.parsnip.XmlWriter.STATE_BEFORE_DOCUMENT)) || ((state) == (me.tatarka.parsnip.XmlWriter.STATE_AFTER_TAG))) {
            pendingNamespace = namespace;
        }else {
            throw new java.lang.IllegalStateException();
        }
    
    return this;
}