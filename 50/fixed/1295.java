@java.lang.Override
public interfaces.ISubEditor getActiveSubEditor() {
    int index = super.getSelectionIndex();
    if (index == (-1)) {
        return null;
    }
    interfaces.ISubEditor ans = subEditors.get(index);
    return ans;
}