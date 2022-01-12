@java.lang.Override
public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
    java.util.List<org.springframework.security.core.GrantedAuthority> auths = new java.util.ArrayList<org.springframework.security.core.GrantedAuthority>();
    java.util.List<cc.hunter.killua.entity.KilluaRole> roles = this.getRoles();
    if ((roles != null) && (!(roles.isEmpty()))) {
        for (cc.hunter.killua.entity.KilluaRole role : roles) {
            auths.add(new org.springframework.security.core.authority.SimpleGrantedAuthority(role.getName()));
        }
    }
    return auths;
}