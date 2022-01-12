@java.lang.Override
public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
    java.util.Set<org.springframework.security.core.GrantedAuthority> authorities = new java.util.HashSet<>();
    if ((this.roles) != null) {
        for (com.imrenagi.service_auth.domain.Role role : this.roles) {
            for (com.imrenagi.service_auth.domain.Permission privilege : role.getPrivileges()) {
                authorities.add(new org.springframework.security.core.authority.SimpleGrantedAuthority(privilege.getName()));
            }
        }
    }
    return authorities;
}