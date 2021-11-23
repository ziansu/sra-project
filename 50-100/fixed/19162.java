@java.lang.Override
public boolean parent() {
    int prevIdx = (elements.size()) - 1;
    java.lang.String prevElem = (prevIdx >= 0) ? elements.get(prevIdx) : null;
    if ((prevElem == null) || (org.apache.jackrabbit.oak.commons.PathUtils.denotesParent(prevElem))) {
        elements.add("..");
        return true;
    }
    if (prevElem.isEmpty()) {
        error("Absolute path escapes root");
        return false;
    }
    elements.remove(prevIdx);
    return true;
}