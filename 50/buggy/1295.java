@java.lang.Override
public interfaces.ISubEditor getActiveSubEditor() {
    int index = super.getSelectionIndex();
    interfaces.ISubEditor ans = subEditors.get(index);
    return ans;
}