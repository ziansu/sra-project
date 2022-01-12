public java.lang.Iterable<java.lang.String> getOrgs() {
    try {
        java.util.List<java.lang.String> allOrgs = new java.util.ArrayList<java.lang.String>();
        allOrgs.add(getCurrentLogin());
        allOrgs.addAll(gh.getMyOrganizations().keySet());
        return allOrgs;
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}