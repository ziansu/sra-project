protected void updateChildren(java.lang.Object elm, java.lang.Object[] children, int currentChildCount) {
    cache.put(elm, children);
    org.polymap.core.runtime.UIThreadExecutor.async(() -> {
        viewer.setChildCount(elm, children.length);
        viewer.replace(elm, 0, (children.length > 0 ? children[0] : null));
    }, org.polymap.core.runtime.UIThreadExecutor.logErrorMsg(""));
}