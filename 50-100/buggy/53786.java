public java.lang.String getRestrictionAsString(java.lang.String name) throws javax.jcr.RepositoryException {
    javax.jcr.Value val = ((org.apache.jackrabbit.api.security.JackrabbitAccessControlEntry) (ace)).getRestriction(name);
    if (val != null) {
        return ((org.apache.jackrabbit.api.security.JackrabbitAccessControlEntry) (ace)).getRestriction(name).getString();
    }
    return "";
}