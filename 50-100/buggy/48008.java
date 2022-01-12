public java.io.OutputStream createOutputStream() {
    java.io.OutputStream os = java.lang.System.out;
    final java.io.File theOutfile = getFileOutput();
    if (theOutfile != null) {
        try {
            os = new java.io.FileOutputStream(theOutfile);
        } catch (java.io.FileNotFoundException e) {
            serr(("unable to write file: " + theOutfile), false);
            return null;
        }
    }
    if (isCopyToClipboard()) {
        sout("copy result to clipboard", true);
        os = new de.greyshine.tools.Trnsfrm.CbOutputStream(os);
    }
    return os;
}