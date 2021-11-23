private org.carewebframework.shell.elements.ElementBase getVisibleChild(boolean first) {
    int start = (first) ? 0 : (getChildCount()) - 1;
    int end = (first) ? (getChildCount()) - 1 : 0;
    int inc = (first) ? 1 : -1;
    for (int i = start; i <= end; i += inc) {
        if (getChild(i).isVisible()) {
            return getChild(i);
        }
    }
    return null;
}