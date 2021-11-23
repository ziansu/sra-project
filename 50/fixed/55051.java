protected void addDDMFormFieldValue(java.lang.String name, java.lang.String value, com.liferay.dynamic.data.mapping.storage.DDMFormValues ddmFormValues) {
    com.liferay.dynamic.data.mapping.storage.DDMFormFieldValue ddmFormFieldValue = createDDMFormFieldValue(name);
    setDDMFormFieldValueLocalizedValue(value, ddmFormFieldValue);
    ddmFormValues.addDDMFormFieldValue(ddmFormFieldValue);
}