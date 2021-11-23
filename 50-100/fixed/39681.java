private void refreshCombo() {
    if ((_comboField) != null) {
        try {
            activeEvent = false;
            _comboField.getItems().clear();
            _comboField.getItems().addAll(_comboValues);
            if ((baseValue) != null)
                setValue(baseValue);
            
        } finally {
            activeEvent = true;
        }
    }
}