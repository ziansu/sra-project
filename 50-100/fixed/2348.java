public static void rdfToHtml(org.spdx.rdfparser.model.SpdxDocument doc, java.io.File docHtmlFile, java.io.File licenseHtmlFile, java.io.File docFilesHtmlFile) throws com.github.mustachejava.MustacheException, java.io.IOException, org.spdx.rdfparser.InvalidSPDXAnalysisException {
    java.lang.String templateDir = org.spdx.tools.RdfToHtml.TEMPLATE_ROOT_PATH;
    java.io.File templateDirectoryRoot = new java.io.File(templateDir);
    if (!((templateDirectoryRoot.exists()) && (templateDirectoryRoot.isDirectory()))) {
        templateDir = org.spdx.tools.RdfToHtml.TEMPLATE_CLASS_PATH;
        templateDirectoryRoot = new java.io.File(templateDir);
    }
    org.spdx.tools.RdfToHtml.rdfToHtml(doc, templateDirectoryRoot, docHtmlFile, licenseHtmlFile, docFilesHtmlFile);
}