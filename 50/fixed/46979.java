public static java.io.File resolveRelativeFilePath(java.io.File baseURIPath, java.lang.String nonURIConformingFilePath) {
    return eu.asterics.mw.services.ResourceRegistry.resolveRelativeFilePath(baseURIPath, nonURIConformingFilePath, true);
}