private static void createTemplateFormatsFolder(final java.lang.String packagePath) {
    final java.lang.String formatsPath = (packagePath + '/') + (com.abiquo.am.services.TemplateConventions.FORMATS_PATH);
    java.io.File formatsFolder = new java.io.File(formatsPath);
    if (!(formatsFolder.exists())) {
        if (!(formatsFolder.mkdir())) {
            throw new com.abiquo.appliancemanager.exceptions.AMException(com.abiquo.am.exceptions.AMError.TEMPLATE_INSTALL, "creating format folder");
        }
    }
}