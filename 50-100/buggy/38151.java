public void purge(boolean links, java.lang.String... titles) throws java.io.IOException {
    java.lang.StringBuilder url = new java.lang.StringBuilder(apiUrl);
    url.append("action=purge");
    if (links)
        url.append("&forcelinkupdate");
    
    java.lang.String[] temp = constructTitleString(titles);
    for (java.lang.String x : temp)
        post(url.toString(), ("titles=" + x), "purge");
    
    log(java.util.logging.Level.INFO, "purge", (("Successfully purged " + (titles.length)) + " pages."));
}