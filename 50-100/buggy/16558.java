@java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
public net.mindengine.galen.validation.ValidationResult check(java.lang.String objectName, net.mindengine.galen.specs.Spec spec) {
    net.mindengine.galen.validation.SpecValidation specValidation = net.mindengine.galen.validation.ValidationFactory.getValidation(spec, this);
    try {
        return specValidation.check(this, objectName, spec);
    } catch (net.mindengine.galen.validation.ValidationErrorException ex) {
        net.mindengine.galen.validation.ValidationResult result = ex.asValidationResult();
        if (spec.isOnlyWarn()) {
            result.getError().setOnlyWarn(true);
        }
        return result;
    }
}