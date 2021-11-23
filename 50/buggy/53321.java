public void setAuthorities(java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> authorities) {
    if (authorities != null) {
        this.authorities = new java.util.HashSet<>(authorities);
    }else {
        this.authorities = null;
    }
}