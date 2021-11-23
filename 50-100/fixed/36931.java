private void configureGrid(com.alu.tat.view.Grid grid) {
    final com.vaadin.data.util.BeanItemContainer<com.alu.tat.entity.schema.SchemaElement> container = new com.vaadin.data.util.BeanItemContainer(com.alu.tat.entity.schema.SchemaElement.class, new java.util.LinkedList<com.alu.tat.entity.schema.SchemaElement>());
    grid.setContainerDataSource(container);
    grid.setColumnOrder("type", "name", "description");
    grid.setEditorEnabled(true);
    grid.addItemClickListener(new com.alu.tat.view.SchemaView.SchemaElementClickListener());
    grid.setSizeFull();
}