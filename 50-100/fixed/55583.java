@org.springframework.web.bind.annotation.RequestMapping(value = "auth/transformation/start", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String generateTransform(@org.springframework.web.bind.annotation.RequestParam(value = "transformation")
java.lang.String transformationIds, @org.springframework.web.bind.annotation.RequestParam(value = "sanitized_network_id")
java.lang.String networkIds, org.springframework.ui.Model model) throws edu.asu.spring.quadriga.exceptions.FileStorageException, edu.asu.spring.quadriga.exceptions.QuadrigaGeneratorException, edu.asu.spring.quadriga.exceptions.QuadrigaStorageException, java.io.IOException {
    java.lang.String[] transformationIdsList = transformationIds.split(",");
    java.util.List<edu.asu.spring.quadriga.domain.network.tranform.ITransformation> transformations = transformationManager.getTransformations(transformationIdsList);
    java.util.List<java.lang.String> networkIdList = java.util.Arrays.asList(networkIds.split("\\s*,\\s*"));
    future = transformProcessor.runTransformationAsync(transformations, networkIdList);
    return "auth/transformation/statusTransformation";
}