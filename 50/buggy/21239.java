@java.lang.Override
public boolean isInitiallyExpanded() {
    if (isInitExpand) {
        isInitExpand = false;
        return true;
    }
    return false;
}