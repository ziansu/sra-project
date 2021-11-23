@org.testng.annotations.Test(dataProviderClass = io.herbert.codebase.openapimodel2.OpenAPISpecificationExamples.class, dataProvider = "validV20JSONSpecifications")
public void jsonSpecificationCanBeMappedToPojoBackToJSON(java.lang.String resourcePath) throws java.lang.Exception {
    try (java.io.InputStream is = getClass().getResourceAsStream(resourcePath)) {
        java.lang.String read = io.herbert.codebase.openapimodel2.Utils.stringFromInputStream(is);
        io.herbert.codebase.openapi2schema.ValidationResult result = validator.validate(read);
        org.assertj.core.api.Assertions.assertThat(result.isSuccess()).isTrue();
        io.herbert.codebase.openapimodel2.OpenAPIModel2 model = mapper.readValue(read, io.herbert.codebase.openapimodel2.OpenAPIModel2.class);
        java.lang.String written = mapper.writeValueAsString(model);
        net.javacrumbs.jsonunit.JsonAssert.assertJsonEquals(read, written);
    }
}