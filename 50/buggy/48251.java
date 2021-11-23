@java.lang.Override
protected final void postProcess(final java.util.Set<org.optimizationBenchmarking.utils.graphics.style.IStyle> usedStyles, final org.optimizationBenchmarking.utils.collections.lists.ArrayListView<org.optimizationBenchmarking.utils.collections.ImmutableAssociation<java.nio.file.Path, org.optimizationBenchmarking.utils.io.IFileType>> paths) {
    this.__finalizeFigureSeries();
    this.__buildSetupPackage(usedStyles);
    this.__compile(paths);
}