private void replaceTable(org.apache.wicket.ajax.AjaxRequestTarget target) {
    com.evolveum.midpoint.web.component.data.BoxedTablePanel table = initTablePanel(provider);
    this.replace(table);
    target.add(this);
}