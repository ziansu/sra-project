private static org.springframework.security.core.authority.SimpleGrantedAuthority getRole(java.lang.String role) {
    ru.kolaer.server.webportal.beans.ToolsLDAP.LOG.debug(role);
    switch (role) {
        case "Domain users" :
            return new org.springframework.security.core.authority.SimpleGrantedAuthority(EnumRole.USER.toString());
        case "OIT" :
            return new org.springframework.security.core.authority.SimpleGrantedAuthority(EnumRole.SUPER_ADMIN.toString());
        case "ПСР Администратор" :
            return new org.springframework.security.core.authority.SimpleGrantedAuthority(EnumRole.PSR_ADMIN.toString());
        case "Анонимный" :
            return new org.springframework.security.core.authority.SimpleGrantedAuthority(EnumRole.ANONYMOUS.toString());
        default :
            return null;
    }
}