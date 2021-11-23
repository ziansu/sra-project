private void searchPerformed(com.evolveum.midpoint.prism.query.ObjectQuery query, org.apache.wicket.ajax.AjaxRequestTarget target) {
    searchQuery = query;
    com.evolveum.midpoint.web.component.data.BoxedTablePanel panel = getTable();
    panel.setCurrentPage(null);
    this.provider.setQuery(query);
    target.add(panel);
}