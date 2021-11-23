@java.lang.Override
protected final org.esa.beam.framework.datamodel.Product readProductNodesImpl() throws java.io.IOException {
    final java.io.File inputFile = getInputFile();
    manifest = createManifestFile(inputFile);
    return createProduct(manifest);
}