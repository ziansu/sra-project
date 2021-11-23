@java.lang.Override
public java.lang.String getUrlName() {
    if (getReportUrl().contains(jenkins.model.Jenkins.getInstance().getRootUrl())) {
        return AllureReportPlugin.URL_PATH;
    }else {
        return getReportUrl();
    }
}