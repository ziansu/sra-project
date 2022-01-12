public java.util.List<org.apache.isis.viewer.wicket.model.mementos.ActionParameterMemento> primeArgumentModels() {
    final org.apache.isis.core.metamodel.spec.feature.ObjectAction objectAction = getActionMemento().getAction(getSpecificationLoader());
    final java.util.List<org.apache.isis.core.metamodel.spec.feature.ObjectActionParameter> parameters = objectAction.getParameters();
    final java.util.List<org.apache.isis.viewer.wicket.model.mementos.ActionParameterMemento> mementos = org.apache.isis.viewer.wicket.model.models.ActionModel.buildParameterMementos(parameters);
    for (final org.apache.isis.viewer.wicket.model.mementos.ActionParameterMemento apm : mementos) {
        getArgumentModel(apm);
    }
    return mementos;
}