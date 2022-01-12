public void syncBeansPom(org.talend.core.model.properties.Property property, boolean overwrite) throws java.lang.Exception {
    org.talend.core.runtime.process.ITalendProcessJavaProject beansProject = runProcessService.getTalendCodeJavaProject(org.talend.core.model.repository.ERepositoryObjectType.valueOf("BEANS"));
    org.eclipse.core.resources.IFile beansPomFile = beansProject.getProjectPom();
    org.talend.designer.maven.tools.creator.CreateMavenBeanPom createTemplatePom = new org.talend.designer.maven.tools.creator.CreateMavenBeanPom(beansPomFile);
    createTemplatePom.setProperty(property);
    createTemplatePom.setOverwrite(overwrite);
    createTemplatePom.create(null);
    buildAndInstallCodesProject(beansProject, runProcessService.isExportConfig());
}