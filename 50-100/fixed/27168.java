protected boolean isVanityCandidate(java.lang.String uri) {
    boolean contentUri = !(isRootRequest(uri));
    if (contentUri) {
        java.util.Map<java.lang.String, java.lang.String> excludes = _vanityUrlModule.get().getExcludes();
        for (java.lang.String exclude : excludes.values()) {
            if ((isNotEmpty(exclude)) && (uri.matches(exclude))) {
                contentUri = false;
                break;
            }
        }
    }
    return contentUri;
}