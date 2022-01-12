@java.lang.Override
@com.wordnik.swagger.annotations.ApiOperation(value = com.sequenceiq.cloudbreak.doc.OperationDescriptions.TemplateOpDescription.GET_BY_ID, produces = com.sequenceiq.cloudbreak.doc.ContentType.JSON, notes = com.sequenceiq.cloudbreak.doc.Notes.TEMPLATE_NOTES)
public com.sequenceiq.cloudbreak.model.TemplateResponse get(java.lang.Long id) {
    com.sequenceiq.cloudbreak.domain.CbUser user = authenticatedUserService.getCbUser();
    com.sequenceiq.cloudbreak.logger.MDCBuilder.buildUserMdcContext(user);
    com.sequenceiq.cloudbreak.domain.Template template = templateService.get(id);
    return convert(template);
}