private boolean streamToFile(java.io.File newFile) {
    try {
        org.jdom2.output.Format frmt = org.jdom2.output.org.jdom.output.Format.getPrettyFormat().setIndent("    ");
        org.jdom2.output.XMLOutputter outp = new org.jdom2.output.XMLOutputter();
        outp.setFormat(org.jdom2.output.Format.getPrettyFormat());
        outp.output(doc, new java.io.FileWriter(newFile));
    } catch (java.io.IOException ie) {
        java.lang.System.out.println(("odml.core.Writer:Output to failed: " + (ie.getMessage())));
        return false;
    }
    java.lang.System.out.println("... write successful!");
    return true;
}