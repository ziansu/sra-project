public java.lang.String getJsonAsString() {
    de.uni_stuttgart.vis.vowl.owl2vowl.export.types.BackupExporter exporter = new de.uni_stuttgart.vis.vowl.owl2vowl.export.types.BackupExporter();
    try {
        converter.export(exporter);
    } catch (java.lang.Exception e) {
        throw new java.lang.IllegalStateException("Problems during export happend. ", e);
    }
    return exporter.getConvertedJson();
}