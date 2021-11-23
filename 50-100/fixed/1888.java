public java.util.Map<java.lang.String, java.util.List<org.bonitasoft.web.toolkit.client.data.item.attribute.validator.Validator>> getValidators() {
    final java.util.Map<java.lang.String, java.util.List<org.bonitasoft.web.toolkit.client.data.item.attribute.validator.Validator>> validators = new java.util.HashMap<java.lang.String, java.util.List<org.bonitasoft.web.toolkit.client.data.item.attribute.validator.Validator>>();
    for (final java.util.Map.Entry<java.lang.String, org.bonitasoft.web.toolkit.client.ui.component.form.entry.ValuedFormEntry> entry : entriesIndex.entrySet()) {
        validators.put(entry.getKey(), entry.getValue().getValidators());
    }
    return validators;
}