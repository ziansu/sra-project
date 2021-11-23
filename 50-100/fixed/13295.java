private static de.metas.ui.web.window.model.DocumentInterfaceWrapper getWrapper(final java.lang.Object model) {
    if (model == null) {
        return null;
    }
    if (java.lang.reflect.Proxy.isProxyClass(model.getClass())) {
        final java.lang.reflect.InvocationHandler ih = java.lang.reflect.Proxy.getInvocationHandler(model);
        if (ih instanceof de.metas.ui.web.window.model.DocumentInterfaceWrapper) {
            final de.metas.ui.web.window.model.DocumentInterfaceWrapper wrapper = ((de.metas.ui.web.window.model.DocumentInterfaceWrapper) (ih));
            return wrapper;
        }
        return null;
    }else
        if (model instanceof de.metas.ui.web.window.model.DocumentInterfaceWrapper) {
            return ((de.metas.ui.web.window.model.DocumentInterfaceWrapper) (model));
        }
    
    return null;
}