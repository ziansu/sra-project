@java.lang.Override
public boolean isApplicable(org.ow2.authzforce.core.pdp.api.EvaluationContext context) throws org.ow2.authzforce.core.pdp.api.IndeterminateEvaluationException {
    try {
        return referredPolicy.isApplicable(context);
    } catch (org.ow2.authzforce.core.pdp.api.IndeterminateEvaluationException e) {
        throw new org.ow2.authzforce.core.pdp.api.IndeterminateEvaluationException((("Error checking whether Policy(Set) referenced by " + (this)) + " is applicable to the request context"), e.getStatusCode(), e);
    }
}