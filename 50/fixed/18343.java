public org.mihalis.opal.itemSelector.DLItem[] getSelection() {
    checkWidget();
    return selection.toArray(new org.mihalis.opal.itemSelector.DLItem[selection.size()]);
}