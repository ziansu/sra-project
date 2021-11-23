protected void toHTML() {
    java.lang.String xsltFile = (path) + (properties.getProperty("xml_to_html_path"));
    java.lang.System.out.println(("- Path: " + (path)));
    java.lang.System.out.println(("- Validation path: " + (validationPath)));
    java.lang.System.out.println(("- final: " + xsltFile));
    espd.app.validation.Report.generateHTMLReports(isServlet, outputPath, xsltFile, properties.getProperty("upload_xml_path"), properties.getProperty("upload_html_path"));
}