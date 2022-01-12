public ch.epfl.data.squall.utilities.CustomReader getReaderForName(java.lang.String name, int fileSection, int fileParts) {
    ch.epfl.data.squall.utilities.CustomReader reader;
    try {
        java.lang.String path = ((basePath) + "/") + name;
        reader = new ch.epfl.data.squall.utilities.SerializableFileInputStream(new java.io.File(path), ((1 * 1024) * 1024), fileSection, fileParts);
    } catch (final java.io.IOException e) {
        throw new java.lang.RuntimeException(((("Filename not found: " + (this)) + " got ") + (ch.epfl.data.squall.utilities.MyUtilities.getStackTrace(e))));
    }
    return reader;
}