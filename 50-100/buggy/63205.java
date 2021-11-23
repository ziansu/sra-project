@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> postProcessOperations(java.util.Map<java.lang.String, java.lang.Object> objects) {
    java.util.HashMap<java.lang.String, java.lang.Object> api = ((java.util.HashMap<java.lang.String, java.lang.Object>) (objects.get("operations")));
    java.util.List<io.swagger.codegen.languages.CodegenOperation> operations = postProcessOperations(((java.util.ArrayList<io.swagger.codegen.languages.CodegenOperation>) (api.get("operation"))), ("/" + (api.get("pathPrefix"))));
    api.put("operation", operations);
    return objects;
}