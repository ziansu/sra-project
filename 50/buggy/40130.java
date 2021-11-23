public org.eclipse.dawnsci.analysis.api.metadata.IDiffractionMetadata getDiffractionMetadataFromNexus(int[] imageSize, org.eclipse.dawnsci.analysis.api.diffraction.DetectorProperties detprop, org.eclipse.dawnsci.analysis.api.diffraction.DiffractionCrystalEnvironment diffcrys) {
    return getDiffractionMetadataFromNexus(imageSize, detprop, diffcrys, null);
}