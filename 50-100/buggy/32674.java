@java.lang.SuppressWarnings(value = "unchecked")
public void cleanup(boolean callPreDestroy) {
    for (org.glassfish.weld.services.JCDIInjectionContext context : dependentContexts) {
        context.cleanup(true);
    }
    if (callPreDestroy) {
        it.preDestroy(instance);
    }
    it.dispose(instance);
    cc.release();
}