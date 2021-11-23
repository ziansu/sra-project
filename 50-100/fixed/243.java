public static void writeDOMXML(org.jdom2.Document document, java.io.FileOutputStream w) throws java.io.IOException {
    org.jdom2.output.XMLOutputter o = new org.jdom2.output.XMLOutputter();
    org.jdom2.output.Format format = org.jdom2.output.Format.getPrettyFormat();
    format.setEncoding("UTF-8");
    format.setIndent("\t");
    o.setFormat(format);
    o.output(document, w);
}