public railo.runtime.type.Collection.Key[] keys() {
    return keys(getAccess(railo.runtime.engine.ThreadLocalPageContext.get()));
}