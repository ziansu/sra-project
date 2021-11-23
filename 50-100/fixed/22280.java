private void addEntry(final org.bonitasoft.web.toolkit.client.ui.component.form.entry.FormEntry entry) {
    if (entry instanceof org.bonitasoft.web.toolkit.client.ui.component.form.entry.AutoCompleteEntry) {
        ((org.bonitasoft.web.toolkit.client.ui.component.form.entry.AutoCompleteEntry) (entry)).addInputHandler(createInputCompleteHandler(), InputCompleteEvent.TYPE);
    }
    getLastContainer().append(entry);
    entriesIndex.put(entry.getJsId().toString(), entry);
}