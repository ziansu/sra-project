private void forceToLooseFocus(java.awt.Component c) {
    java.awt.Container parent = c.getParent();
    while ((parent != null) && (!(parent.isFocusable()))) {
        parent = parent.getParent();
    } 
    if (parent != null) {
        parent.requestFocus();
    }
}