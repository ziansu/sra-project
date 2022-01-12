@java.lang.Override
public void check(org.asn1s.api.Scope scope, org.asn1s.api.Ref<org.asn1s.api.value.Value> valueRef) throws org.asn1s.api.exception.ResolutionException, org.asn1s.api.exception.ValidationException {
    org.asn1s.api.value.Value value = valueRef.resolve(scope);
    org.asn1s.api.exception.ConstraintViolationException violation = null;
    for (org.asn1s.api.constraint.Constraint union : unions) {
        try {
            union.check(scope, value);
            return ;
        } catch (org.asn1s.api.exception.ConstraintViolationException e) {
            if (violation == null)
                violation = e;
            
        }
    }
    if (violation != null)
        throw violation;
    
    throw new java.lang.IllegalStateException();
}