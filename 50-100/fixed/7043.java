private static java.lang.String createDNPath(org.apache.directory.api.ldap.model.name.Dn dn) {
    java.lang.StringBuilder path = new java.lang.StringBuilder();
    for (org.apache.directory.api.ldap.model.name.Rdn rnd : dn.getRdns()) {
        if ((path.length()) > 0) {
            path.append('/');
        }
        path.append(org.apache.jackrabbit.util.Text.escapeIllegalJcrChars(rnd.toString()));
    }
    return path.toString();
}