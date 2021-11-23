@java.lang.Override
public <T> void extract(org.gradle.model.internal.manage.schema.extract.ModelSchemaExtractionContext<T> extractionContext, org.gradle.model.internal.manage.schema.ModelSchemaStore store) {
    org.gradle.model.internal.type.ModelType<org.gradle.language.base.FunctionalSourceSet> functionalSourceSetModelType = org.gradle.model.internal.type.ModelType.of(org.gradle.language.base.FunctionalSourceSet.class);
    if (extractionContext.getType().isAssignableFrom(functionalSourceSetModelType)) {
        extractionContext.found(new org.gradle.language.base.internal.model.FunctionalSourceSetSchema(functionalSourceSetModelType));
    }
}