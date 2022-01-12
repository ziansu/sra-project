private static java.lang.String getProjectBaseDirectory() {
    java.lang.String path = java.nio.file.Paths.get("").toAbsolutePath().normalize().toString();
    path = path.substring(0, path.lastIndexOf(ee.sk.pdfvalidatortest.PdfValidatorSoapTests.PROJECT_SUBMODULE_NAME));
    return path + (java.io.File.separator);
}