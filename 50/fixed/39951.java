@javax.annotation.CheckForNull
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "NP_BOOLEAN_RETURN_NULL", justification = "As designed, implements a third state for the ternary logic")
protected java.lang.Boolean hasPermission(org.acegisecurity.acls.sid.Sid sid, hudson.security.Permission p) {
    if (this.hasPermission(toString(sid), p)) {
        return true;
    }
    return null;
}