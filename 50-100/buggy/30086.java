@org.springframework.security.access.annotation.Secured(value = "hasPermission(#param, 'isPalgaUser')")
@org.springframework.web.bind.annotation.RequestMapping(value = "/requests/{id}/unclaim", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public business.representation.RequestRepresentation unclaim(business.security.UserAuthenticationToken user, @org.springframework.web.bind.annotation.PathVariable
java.lang.String id, @org.springframework.web.bind.annotation.RequestBody
business.representation.RequestRepresentation request) {
    log.info((("PUT /requests/" + id) + "/unclaim"));
    org.activiti.engine.runtime.ProcessInstance instance = getProcessInstance(id);
    org.activiti.engine.task.Task task = getTaskByRequestId(id, "palga_request_review");
    taskService.unclaim(task.getId());
    instance = getProcessInstance(id);
    business.representation.RequestRepresentation updatedRequest = new business.representation.RequestRepresentation();
    transferData(instance, updatedRequest, user.getUser().isPalga());
    return updatedRequest;
}