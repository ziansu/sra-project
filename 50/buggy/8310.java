protected final void addEntryBefore(final org.bonitasoft.web.toolkit.client.ui.component.form.entry.FormEntry entry, final org.bonitasoft.web.toolkit.client.ui.JsId jsid) {
    getLastContainer().prepend(entry);
    this.entriesIndex.put(entry.getJsId().toString(), entry);
}