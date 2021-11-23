protected void doOptions() throws java.io.IOException, javax.servlet.ServletException {
    @lombok.Cleanup
    wbs.framework.activitymanager.ActiveTask activeTask = startTask("doOptions");
    wbs.framework.logging.TaskLogger taskLogger = wbs.web.servlet.WbsServlet.logContext.createTaskLogger("doOptions");
    try {
        wbs.web.file.WebFile file = processPath(taskLogger);
        if (file != null) {
            file.doOptions(taskLogger);
        }else {
            handleNotFound(taskLogger);
        }
    } catch (java.lang.Throwable exception) {
        handleException(taskLogger, exception);
    }
}