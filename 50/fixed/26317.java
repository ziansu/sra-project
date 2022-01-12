public java.lang.String getJenkinsUrl(java.lang.String rootUrl) {
    if ((!(java.util.Objects.isNull(jenkinsUrl))) && (!(jenkinsUrl.equals("")))) {
        return jenkinsUrl;
    }
    return rootUrl;
}