public void saveInternalsMolecules(final java.io.File file, java.util.List<nl.esciencecenter.e3dchem.knime.molviewer.server.api.Molecule> molecules) throws java.io.IOException {
    java.io.ObjectOutputStream out = null;
    try {
        out = new java.io.ObjectOutputStream(new java.util.zip.GZIPOutputStream(new java.io.FileOutputStream(file)));
        out.writeObject(((java.util.ArrayList<nl.esciencecenter.e3dchem.knime.molviewer.server.api.Molecule>) (molecules)));
        out.flush();
    } finally {
        out.close();
    }
}