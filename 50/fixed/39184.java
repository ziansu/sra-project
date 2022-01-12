public static java.lang.Boolean setEnabled(java.lang.Boolean enabled) {
    boolean was = com.redhat.ceylon.model.typechecker.context.ProducedTypeCache.cachingEnabled.get();
    com.redhat.ceylon.model.typechecker.context.ProducedTypeCache.cachingEnabled.set(enabled);
    return was;
}