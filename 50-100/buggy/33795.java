@java.lang.Override
protected nl.ramondevaan.visualization.mesh.Mesh read() throws java.io.IOException {
    java.lang.System.out.println("MESH READ");
    java.lang.String ext = org.apache.commons.io.FilenameUtils.getExtension(path);
    if (!(ext.equals(lastExt))) {
        reader = factory.getMeshReaderByExtensionImpl(ext);
    }
    lastExt = ext;
    if ((reader) == null) {
        throw new java.lang.UnsupportedOperationException("No appropriate reader was found.");
    }
    reader.path = path;
    reader.file = file;
    java.lang.System.out.println("RETURN READ");
    return reader.read();
}