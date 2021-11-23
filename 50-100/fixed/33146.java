@java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
public net.mindengine.galen.validation.ValidationResult check(java.lang.String objectName, net.mindengine.galen.specs.Spec spec) {
    net.mindengine.galen.validation.SpecValidation specValidation = net.mindengine.galen.validation.ValidationFactory.getValidation(spec, this);
    net.mindengine.galen.validation.ValidationResult result = check(specValidation, objectName, spec);
    if ((spec.isOnlyWarn()) && ((result.getError()) != null)) {
        result.getError().setOnlyWarn(true);
    }
    return result;
}