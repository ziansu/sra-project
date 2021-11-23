public final org.bonitasoft.web.toolkit.client.ui.component.form.AbstractForm openSection(final org.bonitasoft.web.toolkit.client.ui.component.form.entry.Section section) {
    if (((containers.size()) > 1) && ((containers.lastElement()) instanceof org.bonitasoft.web.toolkit.client.ui.component.form.entry.FormEntries)) {
        closeSection();
    }
    if ((containers.size()) > 0) {
        getLastContainer().append(section);
    }
    containers.push(section);
    addValuableEntry(section);
    return this;
}