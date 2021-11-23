public static void createTemplateFolder(final java.lang.String enterpriseRepositoryPath, final java.lang.String ovfId) {
    final java.lang.String packagePath = com.abiquo.am.services.TemplateConventions.getTemplatePath(enterpriseRepositoryPath, ovfId);
    java.io.File packFile = new java.io.File(packagePath);
    if (!(packFile.exists())) {
        if (!(packFile.mkdirs())) {
            throw new com.abiquo.appliancemanager.exceptions.AMException(com.abiquo.am.exceptions.AMError.TEMPLATE_INSTALL, packagePath);
        }
    }
    com.abiquo.am.services.filesystem.TemplateFileSystem.createTemplateFormatsFolder(packagePath);
}