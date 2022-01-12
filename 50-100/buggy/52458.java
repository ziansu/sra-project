public org.bonitasoft.web.toolkit.client.ui.component.form.AbstractForm resetEntries() {
    this.entriesIndex = new java.util.HashMap<java.lang.String, org.bonitasoft.web.toolkit.client.ui.component.form.entry.ValuedFormEntry>();
    this.containers = new java.util.Stack<org.bonitasoft.web.toolkit.client.ui.component.containers.Container<org.bonitasoft.web.toolkit.client.ui.component.form.FormNode>>();
    this.buttons = new org.bonitasoft.web.toolkit.client.ui.component.containers.Container<org.bonitasoft.web.toolkit.client.ui.component.form.button.FormButton>(new org.bonitasoft.web.toolkit.client.ui.JsId("formactions"));
    openSection(new org.bonitasoft.web.toolkit.client.ui.component.form.entry.FormEntries());
    return this;
}