@java.lang.SuppressWarnings(value = "unused")
public java.lang.String getBadgeUrl() {
    return getUrlName().equals(AllureReportPlugin.URL_PATH) ? ((getRootUrl()) + (getBuildUrl())) + (getUrlName()) : getUrlName();
}