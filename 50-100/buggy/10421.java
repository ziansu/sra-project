@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.Object> executeOperation(@org.springframework.web.bind.annotation.RequestHeader(value = org.ow2.proactive.scheduling.api.controllers.GraphQLController.REQUEST_HEADER_NAME_SESSION_ID)
java.lang.String sessionId, @org.springframework.web.bind.annotation.RequestParam(value = org.ow2.proactive.scheduling.api.controllers.GraphQLController.DEFAULT_QUERY_KEY)
java.lang.String query, @org.springframework.web.bind.annotation.RequestParam(value = org.ow2.proactive.scheduling.api.controllers.GraphQLController.DEFAULT_OPERATION_NAME, required = false)
java.lang.String operationName, @org.springframework.web.bind.annotation.RequestParam(value = org.ow2.proactive.scheduling.api.controllers.GraphQLController.DEFAULT_VARIABLES_KEY, required = false)
java.lang.String variables) throws java.io.IOException {
    log.debug("sessionId={}", sessionId);
    java.lang.String username = authenticationService.authenticate(sessionId);
    log.trace("username={}", username);
    log.debug("query={}, operationName={}, variables={}", query, operationName, variables);
    return graphqlService.executeQuery(query, operationName, new org.ow2.proactive.scheduling.api.graphql.common.GraphqlContext(sessionId, username), decodeIntoMap(variables));
}