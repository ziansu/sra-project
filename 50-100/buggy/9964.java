@java.lang.Override
public void start() {
    com.door43.translationstudio.core.Library library = com.door43.translationstudio.AppContext.getLibrary();
    try {
        com.door43.translationstudio.AppContext.deployDefaultLibrary(library);
        library.seedDownloadIndex();
    } catch (java.lang.Exception e) {
        com.door43.tools.reporting.Logger.e(this.getClass().getName(), "Failed to deploy the default index", e);
    }
}