@java.lang.Override
public java.lang.String getUrlName() {
    if (((getReportUrl()) == null) || (getReportUrl().contains(getRootUrl()))) {
        return AllureReportPlugin.URL_PATH;
    }else {
        return getReportUrl();
    }
}