public io.swagger.models.Swagger parse(java.lang.String swaggerAsString, java.util.List<io.swagger.models.auth.AuthorizationValue> auths) {
    io.swagger.models.Swagger output;
    try {
        output = new io.swagger.parser.Swagger20Parser().parse(swaggerAsString);
        if (output != null) {
            return new io.swagger.parser.SwaggerResolver().resolve(output, auths);
        }
    } catch (java.io.IOException e) {
    }
    return null;
}