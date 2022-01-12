@java.lang.Override
public java.util.List<com.target.trak.system.validations.TargetTrakValidationError> validateRequest(final com.target.trak.system.service.dto.company.CompanyApiRequest request) throws com.target.trak.system.service.exception.TargetTrakException {
    java.util.List<com.target.trak.system.validations.TargetTrakValidationError> errors = new java.util.ArrayList<com.target.trak.system.validations.TargetTrakValidationError>();
    try {
        errors = validator.validate(request);
    } catch (com.target.trak.system.validations.TargetTrakValidationException e) {
        logger.error("Validation error", e);
    }
    return errors;
}