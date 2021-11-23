private android.view.View createViewByInflaterIfNull(android.view.View viewOrNull, java.lang.String name, android.util.AttributeSet attrs) {
    if (viewOrNull != null)
        return viewOrNull;
    
    java.lang.String viewFullName = viewNameResolver.getViewNameFromLayoutTag(name);
    try {
        return layoutInflater.createView(viewFullName, null, attrs);
    } catch (java.lang.ClassNotFoundException e) {
        throw new java.lang.RuntimeException(e);
    }
}