private java.lang.String getArtifactFileName(final java.lang.String dumpId, final edu.harvard.data.client.canvas.CanvasDataArtifact artifact, final int fileIndex) {
    return (((((artifact.getTableName()) + "-") + dumpId) + "-") + (java.lang.String.format("%05d", fileIndex))) + ".gz";
}