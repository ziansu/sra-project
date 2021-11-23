private void attachDebugLog(com.epam.ta.reportportal.database.entity.LogLevel logLevel) {
    if ((null != (message)) && ((message.length()) != 0)) {
        com.epam.ta.reportportal.ws.model.log.SaveLogRQ saveLogRQ = new com.epam.ta.reportportal.ws.model.log.SaveLogRQ();
        saveLogRQ.setLevel(logLevel.name());
        saveLogRQ.setLogTime(com.epam.ta.reportportal.core.imprt.impl.DateUtils.toDate(startItemTime));
        saveLogRQ.setMessage(message.toString());
        saveLogRQ.setTestItemId(currentId);
        createLogHandler.createLog(saveLogRQ, null, projectId);
    }
}