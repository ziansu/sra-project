@com.wordnik.swagger.annotations.ApiOperation(value = "Get a process template model")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public com.workstream.rest.model.TemplateResponse getTemplate(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String templateId) {
    java.lang.String decode = templateId;
    try {
        decode = new java.lang.String(templateId.getBytes("ISO-8859-1"), "utf-8");
        com.workstream.rest.controller.TemplateController.log.info("Decoded templateId {}", decode);
    } catch (java.io.UnsupportedEncodingException e) {
        com.workstream.rest.controller.TemplateController.log.error("Failed to decode templateId: {}", templateId);
    }
    org.activiti.engine.repository.ProcessDefinition pd = core.getTemplateService().getProcessTemplate(decode);
    if (pd == null) {
        throw new com.workstream.core.exception.ResourceNotFoundException("No such template");
    }
    return com.workstream.rest.model.InnerWrapperObj.valueOf(pd, com.workstream.rest.model.TemplateResponse.class);
}