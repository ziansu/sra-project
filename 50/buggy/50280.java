@java.lang.Override
protected void releaseResources() {
    Destroyable.Util.tryDestroyAll(registry, javax.enterprise.context.ApplicationScoped.class);
    registry = null;
}