public void writeToFile(java.io.File file) {
    try {
        converter.export(new de.uni_stuttgart.vis.vowl.owl2vowl.export.types.FileExporter(file));
    } catch (java.lang.Exception e) {
        throw new java.lang.IllegalStateException(e);
    }
}