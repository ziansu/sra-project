private void refreshCombo() {
    if (((_comboField) != null) && ((baseValue) != null)) {
        try {
            activeEvent = false;
            _comboField.getItems().clear();
            _comboField.getItems().addAll(_comboValues);
            setValue(baseValue);
        } finally {
            activeEvent = true;
        }
    }
}