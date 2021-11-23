protected void saveValues(final org.unicef.rapidreg.forms.Field field) {
    if (android.text.TextUtils.isEmpty(getValueView().getText())) {
        itemValues.addItem(field.getName(), "");
        return ;
    }
    if (field.isNumericField()) {
        itemValues.addItem(field.getName(), java.lang.String.valueOf(getResult()));
    }else {
        itemValues.addItem(field.getName(), getResult());
    }
}