private org.carewebframework.shell.elements.ElementBase getVisibleChild(boolean first) {
    int count = getChildCount();
    int start = (first) ? 0 : count - 1;
    int inc = (first) ? 1 : -1;
    for (int i = start; (i >= 0) && (i < count); i += inc) {
        if (getChild(i).isVisible()) {
            return getChild(i);
        }
    }
    return null;
}