@java.lang.Override
public void onFileChange(java.io.File file) {
    try {
        org.testeditor.core.services.impl.FileWatcher.LOGGER.info(("Projekt: " + (testProjekt.getName())));
        org.testeditor.core.services.impl.FileWatcher.LOGGER.info(("File changed: " + (file.getCanonicalPath())));
        notifyObserver();
    } catch (java.io.IOException e) {
        org.testeditor.core.services.impl.FileWatcher.LOGGER.error(e.getMessage(), e);
    }
}