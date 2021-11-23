public com.github.sylvainlaurent.maven.swaggervalidator.ValidationResult validate(final java.io.File file) {
    final com.github.sylvainlaurent.maven.swaggervalidator.ValidationResult validationResult = new com.github.sylvainlaurent.maven.swaggervalidator.ValidationResult();
    com.fasterxml.jackson.databind.JsonNode spec;
    try {
        spec = readFileContent(file);
    } catch (final java.lang.Exception e) {
        validationResult.addMessage(((("Error while parsing file " + file) + ": ") + (e.getMessage())));
        validationResult.encounteredError();
        return validationResult;
    }
    readSwaggerSpec(spec, validationResult);
    validateSwagger(spec, validationResult);
    return validationResult;
}