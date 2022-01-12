@org.springframework.web.bind.annotation.RequestMapping(value = "/requests/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public business.representation.RequestRepresentation getRequestById(business.security.UserAuthenticationToken user, @org.springframework.web.bind.annotation.PathVariable
java.lang.String id) {
    log.info((((("GET /requests/{" + id) + "} (for user: ") + (user == null ? "null" : user.getId())) + ")"));
    business.representation.RequestRepresentation request = new business.representation.RequestRepresentation();
    if (user == null) {
        throw new business.controllers.RequestController.NotLoggedInException();
    }else {
        org.activiti.engine.runtime.ProcessInstance instance = getProcessInstance(id);
        transferData(instance, request, user.getUser().isPalga());
    }
    return request;
}