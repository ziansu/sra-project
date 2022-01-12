public void generateEntitiesAllPackagesList() {
    org.hibernate.tool.hbm2x.doc.DocFile docFile = docFileManager.getAllPackagesDocFile();
    java.io.File file = docFile.getFile();
    java.util.Map parameters = new java.util.HashMap();
    parameters.put("docFile", docFile);
    java.util.List list = docHelper.getPackages();
    list.remove(0);
    parameters.put("packageList", list);
    processTemplate(parameters, org.hibernate.tool.hbm2x.DocExporter.FTL_ENTITIES_PACKAGE_LIST, file);
}