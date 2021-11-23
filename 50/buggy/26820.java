private java.lang.String getADocFileName() {
    return ((((destPath.toString()) + "/") + (name)) + (remote ? "" : "/" + (getConceptBaseName()))) + ".adoc";
}