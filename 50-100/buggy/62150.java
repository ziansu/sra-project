public boolean setDoiToNotAvailable(java.lang.String projectId, java.lang.String studyId) throws freemarker.template.TemplateException, java.io.IOException {
    eu.dzhw.fdz.metadatamanagement.projectmanagement.domain.DataAcquisitionProject project = this.projectRepository.findOne(projectId);
    java.lang.String registerXmlStr = org.apache.commons.io.IOUtils.toString(this.registerXml.getInputStream(), com.google.common.base.Charsets.UTF_8);
    java.lang.String filledTemplate = this.fillTemplate(registerXmlStr, this.getTemplateConfiguration(), this.getDataForTemplate(studyId, eu.dzhw.fdz.metadatamanagement.projectmanagement.service.DaraService.AVAILABILITY_CONTROLLED_NOT_AVAILABLE));
    return this.postToDaraImportXml(filledTemplate, project.isHasBeenReleasedBefore());
}