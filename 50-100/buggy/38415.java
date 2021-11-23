public static java.util.List<java.lang.String> repositoryUserContentUrl(org.eclipse.egit.github.core.Repository repo, java.lang.String branch, java.util.List<java.lang.String> fileUrls) {
    java.util.List<java.lang.String> urls = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String singlePath : fileUrls) {
        java.lang.String url = ((repo.getHtmlUrl()) + branch) + "/";
        url = url.replace("github.com", "raw.githubusercontent.com");
        urls.add(org.apache.commons.lang3.StringUtils.join(url, singlePath));
    }
    return urls;
}