@java.lang.Override
public void disposeWorld() {
    if ((disposeWorldFn) != null)
        disposeWorldFn.call(cx, scope, scope, new java.lang.Object[0]);
    
}