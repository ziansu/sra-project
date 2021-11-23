private org.esa.snap.productlibrary.rcp.toolviews.model.repositories.RepositoryInterface addRepository(final java.io.File baseDir, final org.esa.snap.productlibrary.rcp.toolviews.DBScanner.Options options) {
    libConfig.addBaseDir(baseDir);
    final org.esa.snap.productlibrary.rcp.toolviews.model.repositories.RepositoryInterface repo = addToRepositoryListCombo(baseDir);
    setUIComponentsEnabled(doRepositoriesExist());
    updateRepostitory(repo, options);
    return repo;
}