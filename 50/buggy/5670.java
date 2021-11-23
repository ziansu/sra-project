public java.lang.Object getPrincipal() {
    org.jsecurity.subject.PrincipalCollection principals = getPrincipals();
    if (principals.isEmpty()) {
        return null;
    }
    return principals.asSet().iterator().next();
}