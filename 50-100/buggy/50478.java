public static java.net.URI getFileURI(final java.lang.String remoteUrl, final java.lang.String filePath, final java.lang.String gitRemoteBranchName) {
    java.lang.String uri = com.microsoft.alm.common.utils.UrlHelper.getHttpsGitUrlFromSshUrl(remoteUrl).concat(com.microsoft.alm.common.utils.UrlHelper.URL_PATH_SEGMENT).concat(filePath);
    if (org.apache.commons.lang.StringUtils.isNotEmpty(gitRemoteBranchName)) {
        uri.concat(com.microsoft.alm.common.utils.UrlHelper.URL_GIT_VERSION_SEGMENT).concat(gitRemoteBranchName);
    }
    return com.microsoft.alm.common.utils.UrlHelper.createUri(uri);
}