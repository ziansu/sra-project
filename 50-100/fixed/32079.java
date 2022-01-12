@java.lang.Override
public void writeAuxiliaryTriples() throws org.openrdf.rio.RDFHandlerException {
    java.util.Iterator<V> valueIterator = this.valueQueue.iterator();
    for (org.openrdf.model.Resource resource : this.valueSubjectQueue) {
        if (!(this.declaredValues.add(resource))) {
            valueIterator.next();
            continue;
        }
        writeValue(valueIterator.next(), resource);
    }
    this.valueSubjectQueue.clear();
    this.valueQueue.clear();
}