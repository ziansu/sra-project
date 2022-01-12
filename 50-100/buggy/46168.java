@java.lang.Override
protected java.util.List<org.eclipse.ltk.core.refactoring.Change> getChanges(ru.runa.gpd.lang.model.Variable oldVariable, ru.runa.gpd.lang.model.Variable newVariable) throws java.lang.Exception {
    java.util.List<org.eclipse.ltk.core.refactoring.Change> changes = new java.util.ArrayList<>();
    if (swimlaneInitializer.hasReference(oldVariable)) {
        changes.add(new ru.runa.gpd.ltk.SwimlanePresentation.SwimlaneInitializerChange(element, oldVariable, newVariable));
    }
    return changes;
}