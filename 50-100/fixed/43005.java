@java.lang.Override
protected org.apache.wicket.Component getStoredQueryNameComponent() {
    org.apache.wicket.markup.html.panel.Fragment f = new org.apache.wicket.markup.html.panel.Fragment("storedQueryName", "newPage", this);
    storedQueriesDropDown = storedQueriesDropDown();
    f.add(storedQueriesDropDown);
    org.apache.wicket.markup.html.form.TextField<java.lang.String> textField = new org.apache.wicket.markup.html.form.TextField("nativeName", new org.apache.wicket.model.PropertyModel(this, "nativeName"));
    textField.setRequired(true);
    textField.add(new org.geoserver.web.data.layer.CascadedWFSStoredQueryNewPage.ViewNameValidator());
    f.add(textField);
    return f;
}