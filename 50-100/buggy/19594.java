@java.lang.Override
public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
    java.util.ArrayList<cz.cuni.mff.xrg.odcs.commons.app.user.Permission> permissions = new java.util.ArrayList<>();
    for (cz.cuni.mff.xrg.odcs.commons.app.user.RoleEntity role : getRoles()) {
        if ((role.getPermissions()) != null) {
            for (cz.cuni.mff.xrg.odcs.commons.app.user.Permission p : role.getPermissions()) {
                if (!(permissions.contains(p))) {
                    permissions.add(p);
                }
            }
        }
    }
    return permissions;
}