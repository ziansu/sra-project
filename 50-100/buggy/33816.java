public java.lang.Iterable<org.wikiup.core.inf.Document> getChildren() {
    final java.lang.Iterable<org.wikiup.database.orm.inf.Relatives> iterable = org.wikiup.core.util.Interfaces.cast(java.lang.Iterable.class, relatives);
    if (iterable == null)
        return org.wikiup.core.impl.Null.getInstance();
    
    return new java.lang.Iterable<org.wikiup.core.inf.Document>() {
        @java.lang.Override
        public java.util.Iterator<org.wikiup.core.inf.Document> iterator() {
            return new org.wikiup.database.orm.imp.document.DocumentByRelatives.IteratorImpl(iterable.iterator());
        }
    };
}