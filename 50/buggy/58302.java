@java.lang.Override
public ui.DropdownSearch setValue(float newValue) {
    searchBuffer = new java.lang.StringBuilder("");
    reorderItems();
    super.setValue(newValue);
    return this;
}