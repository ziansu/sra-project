protected void closeEditWidget() {
    remove(editableValue);
    remove(buttons);
    add(valueLabel);
    editing = false;
}