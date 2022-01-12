@java.lang.Override
public org.ow2.authzforce.core.pdp.api.value.Bag<AV> evaluate(org.ow2.authzforce.core.pdp.api.EvaluationContext context) throws org.ow2.authzforce.core.pdp.api.IndeterminateEvaluationException {
    if (context == null) {
        throw missingAttributeBecauseNullContextException;
    }
    final org.ow2.authzforce.core.pdp.api.value.Bag<AV> bag = attrProvider.get(attrGUID, attributeType, context);
    if (bag == null) {
        throw this.missingAttributeForUnknownReasonException;
    }
    if ((mustBePresent) && (bag.isEmpty())) {
        throw new org.ow2.authzforce.core.pdp.api.IndeterminateEvaluationException(missingAttributeMessage, org.ow2.authzforce.core.pdp.api.StatusHelper.STATUS_MISSING_ATTRIBUTE, bag.getReasonWhyEmpty());
    }
    return bag;
}