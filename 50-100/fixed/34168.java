public void setWidget(final com.ponysdk.core.ui.basic.PWidget w) {
    if (w == (this))
        throw new java.lang.UnsupportedOperationException("You cannot call setWidget with 'this' in parameter");
    
    if (w == (widget)) {
        return ;
    }
    if (w != null) {
        w.removeFromParent();
    }
    if ((widget) != null) {
        remove(widget);
    }
    widget = w;
    if (w != null) {
        w.saveAdd(w.getID(), com.ponysdk.core.ui.basic.ID);
        adopt(w);
    }
}