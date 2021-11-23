@java.lang.Override
public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
    java.util.Collection<cz.cuni.mff.xrg.odcs.commons.app.user.Permission> permissions = new java.util.HashSet<>();
    for (cz.cuni.mff.xrg.odcs.commons.app.user.RoleEntity role : getRoles()) {
        if ((role.getPermissions()) != null) {
            for (cz.cuni.mff.xrg.odcs.commons.app.user.Permission p : role.getPermissions()) {
                permissions.add(p);
            }
        }
    }
    return permissions;
}