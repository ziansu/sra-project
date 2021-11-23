private static org.aludratest.testcase.event.ErrorReport checkForError(org.aludratest.service.SystemConnector connector) {
    org.aludratest.testcase.event.SystemErrorReporter reporter = connector.getConnector(org.aludratest.testcase.event.SystemErrorReporter.class);
    return reporter != null ? reporter.checkForError() : null;
}