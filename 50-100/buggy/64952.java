@java.lang.Override
public void preprocessSwagger(io.swagger.models.Swagger swagger) {
    if ("/".equals(swagger.getBasePath())) {
        swagger.setBasePath("");
    }
    java.lang.String host = swagger.getHost();
    java.lang.String port = "8080";
    if (host != null) {
        java.lang.String[] parts = host.split(":");
        if ((parts.length) > 1) {
            port = parts[1];
        }
    }
    this.additionalProperties.put("serverPort", port);
}