public int size() {
    return size(getAccess(railo.runtime.engine.ThreadLocalPageContext.get()));
}