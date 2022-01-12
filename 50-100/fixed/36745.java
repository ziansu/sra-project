@java.lang.Override
public void validate(java.lang.String newValue, com.constellio.model.frameworks.validation.ValidationErrors errors) {
    if ((newValue != null) && (!(com.constellio.app.modules.rm.validator.EndYearValueCalculator.MM_DD.matcher(newValue).matches()))) {
        java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>();
        errors.add(com.constellio.app.modules.rm.validator.EndYearValueCalculator.class, "InvalideEndYear");
    }
}