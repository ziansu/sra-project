public void destroy() {
    java.lang.Integer counter = org.romaframework.core.flow.ObjectContext.getInstance().getContextComponent(org.romaframework.core.RomaContext.CTX_CREATED);
    if (counter == 0) {
        java.util.List<org.romaframework.core.flow.ContextLifecycleListener> contextListener = org.romaframework.core.flow.Controller.getInstance().getListeners(org.romaframework.core.flow.ContextLifecycleListener.class);
        for (org.romaframework.core.flow.ContextLifecycleListener listener : contextListener) {
            listener.onContextDestroy();
        }
        org.romaframework.core.flow.ObjectContext.getInstance().setContextComponent(org.romaframework.core.RomaContext.CTX_CREATED, null);
    }else
        org.romaframework.core.flow.ObjectContext.getInstance().setContextComponent(org.romaframework.core.RomaContext.CTX_CREATED, (--counter));
    
}