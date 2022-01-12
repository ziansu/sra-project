private java.lang.String getFilename(java.lang.String title, java.lang.String filename) {
    final java.lang.String[] path = gdsc.core.ij.Utils.decodePath(filename);
    final ij.io.OpenDialog chooser = new ij.io.OpenDialog(title, path[0], path[1]);
    if ((chooser.getFileName()) == null)
        return null;
    
    return gdsc.core.ij.Utils.replaceExtension(((chooser.getDirectory()) + (chooser.getFileName())), ".xls");
}