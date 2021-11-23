public java.lang.String getReasonDisabledIfAny() {
    final org.apache.isis.core.metamodel.adapter.ObjectAdapter targetAdapter = getTargetAdapter();
    final org.apache.isis.core.metamodel.spec.feature.ObjectAction objectAction = getActionMemento().getAction(getSpecificationLoader());
    final org.apache.isis.core.metamodel.consent.Consent usability = objectAction.isUsable(targetAdapter, InteractionInitiatedBy.USER, Where.OBJECT_FORMS);
    final java.lang.String disabledReasonIfAny = usability.getReason();
    return disabledReasonIfAny;
}