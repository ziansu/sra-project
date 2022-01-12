public org.bonitasoft.web.toolkit.client.common.TreeIndexed<java.lang.String> getValues() {
    final org.bonitasoft.web.toolkit.client.common.TreeIndexed<java.lang.String> allParameters = hiddens.copy();
    for (final java.util.Map.Entry<java.lang.String, org.bonitasoft.web.toolkit.client.ui.component.form.entry.ValuedFormEntry> entry : entriesIndex.entrySet()) {
        if ((entry.getValue()) != null) {
            allParameters.addValue(entry.getKey(), getEntryValue(entry.getKey()));
        }
    }
    return allParameters;
}