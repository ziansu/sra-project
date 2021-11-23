public java.lang.Iterable<java.lang.String> getOrgs() {
    try {
        final java.util.List<java.lang.String> allOrgs = new java.util.ArrayList<>();
        allOrgs.add(getCurrentLogin());
        allOrgs.addAll(this.gh.getMyOrganizations().keySet());
        return allOrgs;
    } catch (final java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}