private org.androidannotations.internal.model.AnnotationElements validateAnnotations(org.androidannotations.internal.model.AnnotationElements extractedModel, org.androidannotations.internal.model.AnnotationElementsHolder validatingHolder) {
    timeStats.start("Validate Annotations");
    org.androidannotations.internal.process.ModelValidator modelValidator = new org.androidannotations.internal.process.ModelValidator(androidAnnotationsEnv);
    org.androidannotations.internal.model.AnnotationElements validatedAnnotations = modelValidator.validate(extractedModel, validatingHolder);
    timeStats.stop("Validate Annotations");
    return validatedAnnotations;
}