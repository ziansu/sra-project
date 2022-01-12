@java.lang.Override
public org.apache.wicket.request.mapper.parameter.PageParameters getPageParametersWithoutUiHints() {
    final org.apache.isis.core.metamodel.adapter.ObjectAdapter adapter = getTargetAdapter();
    final org.apache.isis.core.metamodel.spec.feature.ObjectAction objectAction = getActionMemento().getAction(getSpecificationLoader());
    final org.apache.wicket.request.mapper.parameter.PageParameters pageParameters = org.apache.isis.viewer.wicket.model.models.ActionModel.createPageParameters(adapter, objectAction, ConcurrencyChecking.NO_CHECK);
    final org.apache.isis.core.metamodel.adapter.ObjectAdapter[] argumentsAsArray = getArgumentsAsArray();
    for (final org.apache.isis.core.metamodel.adapter.ObjectAdapter argumentAdapter : argumentsAsArray) {
        final java.lang.String encodedArg = encodeArg(argumentAdapter);
        PageParameterNames.ACTION_ARGS.addStringTo(pageParameters, encodedArg);
    }
    return pageParameters;
}