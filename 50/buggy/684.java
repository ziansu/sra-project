@java.lang.Override
protected org.apache.isis.core.metamodel.adapter.ObjectAdapter load() {
    detach();
    final org.apache.isis.core.metamodel.adapter.ObjectAdapter results = executeAction();
    this.actionMode = org.apache.isis.viewer.wicket.model.models.ActionModel.Mode.RESULTS;
    return results;
}