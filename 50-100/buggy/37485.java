private void delete(hudson.FilePath filePath, ru.yandex.qatools.allure.jenkins.utils.PrintStreamWrapper logger) {
    try {
        filePath.deleteContents();
        filePath.deleteRecursive();
    } catch (java.io.IOException | java.lang.InterruptedException e) {
        logger.println("Can't delete directory [%s]", filePath);
        e.printStackTrace(logger.getPrintStream());
    }
}