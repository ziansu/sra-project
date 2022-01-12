private java.util.Date parseDateTo() throws java.lang.IllegalArgumentException {
    java.lang.String dateToParam = getHttpRequest().getParameter(org.everit.jira.reporting.plugin.web.JiraTimetrackerTableWebAction.PARAM_DATETO);
    if ((dateToParam != null) && (!("".equals(dateToParam)))) {
        dateToFormated = java.lang.Long.valueOf(dateToParam);
        return new java.util.Date(dateToFormated);
    }else {
        throw new java.lang.IllegalArgumentException(org.everit.jira.reporting.plugin.web.JiraTimetrackerTableWebAction.INVALID_END_TIME);
    }
}