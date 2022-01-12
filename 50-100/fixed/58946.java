public void valueChange(com.vaadin.data.Property.ValueChangeEvent event) {
    if (com.c2point.tools.ui.repositoryview.ToolsListView.logger.isDebugEnabled())
        com.c2point.tools.ui.repositoryview.ToolsListView.logger.debug("Selection were changed");
    
    try {
        java.lang.Object itemId = itemsTable.getValue();
        model.setSelectedItem(((com.c2point.tools.entity.repository.ToolItem) (itemId)));
    } catch (java.lang.Exception e) {
        com.c2point.tools.ui.repositoryview.ToolsListView.logger.debug("No selection. Tool Item cannot be fetched from itemsList ");
        model.setSelectedItem(null);
    }
}