void setChecked(boolean checked) {
    if ((checkBox) != null) {
        checkBox.setChecked(checked);
        model.setChecked(checked);
    }
}