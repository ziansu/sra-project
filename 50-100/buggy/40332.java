public java.lang.String getReasonInvalidIfAny() {
    final org.apache.isis.core.metamodel.adapter.ObjectAdapter targetAdapter = getTargetAdapter();
    final org.apache.isis.core.metamodel.adapter.ObjectAdapter[] proposedArguments = getArgumentsAsArray();
    final org.apache.isis.core.metamodel.spec.feature.ObjectAction objectAction = getActionMemento().getAction(getSpecificationLoader());
    final org.apache.isis.core.metamodel.consent.Consent validity = objectAction.isProposedArgumentSetValid(targetAdapter, proposedArguments, InteractionInitiatedBy.USER);
    return validity.isAllowed() ? null : validity.getReason();
}