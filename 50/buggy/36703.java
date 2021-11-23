public void addButton(int id, java.lang.String description) {
    android.widget.RadioButton radioButton = getNewButton();
    radioButton.setId(id);
    radioButton.setContentDescription(description);
    addButton(radioButton);
}