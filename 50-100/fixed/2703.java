private org.verapdf.pdfa.results.ValidationResult startValidation(org.verapdf.pdfa.validation.ValidationProfile validationProfile, org.verapdf.model.ModelParser parser, org.verapdf.processor.config.Config config) {
    org.verapdf.pdfa.PDFAValidator validator = org.verapdf.pdfa.validators.Validators.createValidator(validationProfile, org.verapdf.processor.ProcessorImpl.logPassed(config), config.getMaxNumberOfFailedChecks());
    org.verapdf.pdfa.results.ValidationResult validationResult = validate(validator, parser);
    return validationResult;
}