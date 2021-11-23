protected java.lang.Boolean hasPermission(org.acegisecurity.acls.sid.Sid sid, hudson.security.Permission p) {
    if (this.hasPermission(toString(sid), p))
        return true;
    
    return null;
}