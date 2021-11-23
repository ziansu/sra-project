private org.springframework.web.servlet.ModelAndView putConsoleOutput(final com.thoughtworks.go.domain.JobIdentifier jobIdentifier, final java.io.InputStream inputStream) throws java.lang.Exception {
    java.io.File consoleLogFile = consoleService.consoleLogFile(jobIdentifier);
    boolean updated = consoleService.updateConsoleLog(consoleLogFile, inputStream);
    if (updated) {
        consoleActivityMonitor.consoleUpdatedFor(jobIdentifier);
        return com.thoughtworks.go.server.web.FileModelAndView.fileAppended(consoleLogFile.getPath());
    }else {
        return com.thoughtworks.go.server.web.FileModelAndView.errorSavingFile(consoleLogFile.getPath());
    }
}