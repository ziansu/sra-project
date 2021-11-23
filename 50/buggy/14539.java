public void reset() {
    timeServer = "";
    componentDumpTemplate = "";
    factory.resetPageContext();
    ormengines.clear();
    compressResources.clear();
    clearFunctionCache();
    clearCTCache();
    clearComponentCache();
    clearComponentMetadata();
}