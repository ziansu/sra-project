public void deployTemplate(co.cask.cdap.proto.Id.Namespace namespace, java.lang.String templateName) throws co.cask.cdap.common.exception.NotFoundException, java.io.IOException, java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    co.cask.cdap.internal.app.runtime.adapter.ApplicationTemplateInfo templateInfo = appTemplateInfos.get().get(templateName);
    if (templateInfo == null) {
        throw new co.cask.cdap.common.exception.NotFoundException(Id.ApplicationTemplate.from(templateName));
    }
    registerTemplates();
    deployTemplate(namespace, templateInfo);
}