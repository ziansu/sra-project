private void replaceTable(org.apache.wicket.ajax.AjaxRequestTarget target) {
    com.evolveum.midpoint.web.component.data.BoxedTablePanel table = initTablePanel();
    this.replace(table);
    target.add(this);
}