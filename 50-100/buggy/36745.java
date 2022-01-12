@java.lang.Override
public void validate(java.lang.String newValue, com.constellio.model.frameworks.validation.ValidationErrors errors) {
    if ((newValue != null) && (!(com.constellio.app.modules.rm.validator.EndYearValueCalculator.MM_DD.matcher(newValue).matches()))) {
        java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>();
        parameters.put("message", com.constellio.app.ui.i18n.i18n.$("com.constellio.app.modules.rm.RMConfigs.EndYearValueCalculator"));
        errors.add(com.constellio.app.modules.rm.validator.EndYearValueCalculator.class, "InvalideEndYear", parameters);
    }
}