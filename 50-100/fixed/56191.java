protected void createMetadata(uk.ac.diamond.scisoft.analysis.io.DataHolder output, @java.lang.SuppressWarnings(value = "unused")
javax.imageio.ImageReader reader) {
    if ((metadata) == null) {
        metadata = new org.eclipse.january.metadata.Metadata();
    }
    metadata.setFilePath(fileName);
    for (java.lang.String n : output.getNames()) {
        org.eclipse.january.dataset.ILazyDataset lazy = output.getLazyDataset(n);
        metadata.addDataInfo(n, lazy.getShape());
    }
}