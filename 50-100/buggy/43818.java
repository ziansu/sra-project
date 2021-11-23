public final org.bonitasoft.web.toolkit.client.ui.component.form.AbstractForm openSection(final org.bonitasoft.web.toolkit.client.ui.component.form.entry.Section section) {
    if (((this.containers.size()) > 1) && ((this.containers.lastElement()) instanceof org.bonitasoft.web.toolkit.client.ui.component.form.entry.FormEntries)) {
        closeSection();
    }
    if ((this.containers.size()) > 0) {
        getLastContainer().append(section);
    }
    this.containers.push(section);
    addValuableEntry(section);
    return this;
}