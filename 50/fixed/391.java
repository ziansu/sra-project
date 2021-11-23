public void refresh(android.widget.CheckBox checkbox, int index) {
    java.util.Set<java.lang.Object> modelValues = retrieveModelValues();
    checkbox.setChecked(modelValues.contains((!(areValuesDefined()) ? checkbox.getText() : index)));
}