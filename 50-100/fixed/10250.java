@java.lang.Override
public void save(java.lang.Object editingObject) throws java.lang.Exception {
    org.uengine.modeling.resource.resources.ProcessDefinition definition = ((org.uengine.modeling.resource.resources.ProcessDefinition) (editingObject));
    definition.setName(getDisplayName());
    separateGlobalDefinition(definition);
    super.save(editingObject);
    definitionFactory.removeFromCache(getPath());
}