@java.lang.SuppressWarnings(value = "static-method")
public io.swagger.codegen.Model modelFromProperty(io.swagger.codegen.MapProperty object, @java.lang.SuppressWarnings(value = "unused")
java.lang.String path) {
    java.lang.String description = object.getDescription();
    java.lang.String example = object.getExample();
    io.swagger.codegen.ArrayModel model = new io.swagger.codegen.ArrayModel();
    model.setDescription(description);
    model.setExample(example);
    model.setItems(object.getAdditionalProperties());
    return model;
}