public com.linkedpipes.etl.storage.unpacker.model.executor.ExecutorComponent expand(com.linkedpipes.etl.storage.unpacker.model.designer.DesignerComponent srcComponent, com.linkedpipes.etl.storage.unpacker.model.template.ReferenceTemplate template) throws com.linkedpipes.etl.storage.BaseException {
    mergeWithTemplate(template, srcComponent.getConfigurationGraph());
    com.linkedpipes.etl.storage.unpacker.model.designer.DesignerComponent component = new com.linkedpipes.etl.storage.unpacker.model.designer.DesignerComponent(srcComponent);
    component.setTemplate(template.getTemplate());
    component.setTypes(java.util.Arrays.asList(template.getTemplate()));
    return expander.expand(component);
}