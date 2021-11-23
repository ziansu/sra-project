public static void render(org.kohsuke.stapler.StaplerResponse rsp, java.lang.Object output) throws java.io.IOException {
    rsp.setContentType("application/json");
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper(new com.fasterxml.jackson.core.JsonFactory());
    mapper.setVisibilityChecker(mapper.getSerializationConfig().getDefaultVisibilityChecker().withGetterVisibility(JsonAutoDetect.Visibility.PUBLIC_ONLY).withSetterVisibility(JsonAutoDetect.Visibility.NONE));
    mapper.writeValue(rsp.getOutputStream(), output);
}