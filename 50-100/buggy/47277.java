@graphql.sql.web.RequestMapping(value = "/", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public java.lang.Object executeOperation(@graphql.sql.web.RequestBody
graphql.sql.web.RelayRequest request) throws java.io.IOException {
    graphql.ExecutionResult executionResult = getExecutionResult(request);
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.LinkedHashMap<>();
    if ((executionResult.getErrors().size()) > 0) {
        result.put("errors", executionResult.getErrors());
    }
    result.put("data", executionResult.getData());
    return result;
}