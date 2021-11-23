public java.util.Iterator keyIterator() {
    return iterator(getAccess(railo.runtime.engine.ThreadLocalPageContext.get()));
}