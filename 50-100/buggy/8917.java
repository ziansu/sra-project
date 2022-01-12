private java.lang.String readDir(org.jdom2.Document doc, java.lang.String[] files, java.lang.String dirName) {
    if (files != null) {
        java.util.Arrays.sort(files);
    }
    java.lang.String eDir = dirName;
    org.jdom2.Element p = buildElement(files, dirName, eDir);
    doc.getRootElement().addContent(p);
    return p.getName();
}