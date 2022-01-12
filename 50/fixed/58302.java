@java.lang.Override
public ui.DropdownSearch setValue(float newValue) {
    super.setValue(newValue);
    searchBuffer = new java.lang.StringBuilder("");
    return this;
}