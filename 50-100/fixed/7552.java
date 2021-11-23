private void validate() {
    java.lang.String valueAsString = dateBox.getTextBox().getValue();
    if (com.google.common.base.Strings.isNullOrEmpty(valueAsString)) {
        valueUpdater.update(null);
    }else {
        java.util.Date dateValue = this.dateBox.getFormat().parse(dateBox, valueAsString, false);
        if (dateValue == null) {
            valueUpdater.onInvalid(I18N.MESSAGES.dateFieldInvalidValue(org.activityinfo.ui.client.component.form.field.DateFieldWidget.FORMAT));
        }else {
            valueUpdater.update(new org.activityinfo.model.type.time.LocalDate(dateValue));
        }
    }
}