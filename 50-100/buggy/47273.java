@java.lang.SuppressWarnings(value = "unchecked")
public void cleanup(boolean callPreDestroy) {
    for (org.glassfish.weld.services.JCDIInjectionContext context : dependentContexts) {
        context.cleanup(true);
    }
    if (callPreDestroy) {
        if ((it) != null) {
            it.preDestroy(instance);
        }
    }
    if ((it) != null) {
        it.dispose(instance);
    }
    if ((cc) != null) {
        cc.release();
    }
}