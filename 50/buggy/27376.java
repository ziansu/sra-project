@java.lang.Override
public void disposeWorld() {
    try {
        if ((disposeWorldFn) != null)
            disposeWorldFn.call(cx, scope, scope, new java.lang.Object[0]);
        
    } finally {
        buildWorldFn = null;
        disposeWorldFn = null;
    }
}