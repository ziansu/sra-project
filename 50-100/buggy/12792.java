public java.lang.String getVoteSiteName(java.lang.String url) {
    java.util.ArrayList<java.lang.String> sites = com.Ben12345rocks.VotingPlugin.Config.ConfigVoteSites.getInstance().getVoteSitesNames();
    for (java.lang.String siteName : sites) {
        java.lang.String URL = com.Ben12345rocks.VotingPlugin.Config.ConfigVoteSites.getInstance().getServiceSite(siteName);
        if (URL.equals(url)) {
            return siteName;
        }
    }
    return url;
}