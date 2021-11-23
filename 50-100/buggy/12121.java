private org.eclipse.dawnsci.analysis.api.metadata.IDiffractionMetadata getMeta(uk.ac.diamond.scisoft.analysis.processing.operations.twod.DiffractionMetadataImportModel mod, org.eclipse.dawnsci.analysis.api.dataset.ILazyDataset parent) {
    org.eclipse.dawnsci.analysis.api.metadata.IDiffractionMetadata lmeta = metadata;
    if (lmeta == null) {
        synchronized(this) {
            lmeta = metadata;
            if (lmeta == null) {
                org.eclipse.dawnsci.analysis.api.metadata.IDiffractionMetadata md = uk.ac.diamond.scisoft.analysis.io.NexusDiffractionCalibrationReader.getDiffractionMetadataFromNexus(mod.getFilePath(), parent);
                if (md == null)
                    throw new org.eclipse.dawnsci.analysis.api.processing.OperationException(this, "File does not contain metadata");
                
                metadata = lmeta = md;
            }
        }
    }
    return lmeta;
}