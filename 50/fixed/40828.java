void setChecked(boolean checked) {
    if ((checkBox) != null) {
        if (model.setChecked(checked)) {
            checkBox.setChecked(checked);
        }
    }
}