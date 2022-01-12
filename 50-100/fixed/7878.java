public static java.net.URL fromProjectID(int projectID) {
    try {
        final java.net.URL url = com.therandomlabs.utils.network.NetworkUtils.getRedirectedURL(com.therandomlabs.curseapi.Curse.PROJECT_URL.replaceAll(com.therandomlabs.curseapi.Curse.PROJECT_ID, java.lang.Integer.toString(projectID)), 2);
        if (!(com.therandomlabs.curseapi.Curse.isCurseProjectNoRedirect(com.therandomlabs.utils.network.NetworkUtils.getRedirectedURL(url)))) {
            throw new com.therandomlabs.curseapi.InvalidProjectIDException(("Invalid project ID: " + projectID));
        }
        return url;
    } catch (java.io.IOException ex) {
        throw new com.therandomlabs.curseapi.CurseException(ex);
    }
}