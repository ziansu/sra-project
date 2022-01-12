private java.util.List<org.springframework.security.core.GrantedAuthority> buildUserAuthority(java.util.List<hu.neuron.java.sales.service.vo.RoleVO> userRoles) {
    java.util.Set<org.springframework.security.core.GrantedAuthority> setAuths = new java.util.HashSet<org.springframework.security.core.GrantedAuthority>();
    for (hu.neuron.java.sales.service.vo.RoleVO userRole : userRoles) {
        java.lang.System.out.println(userRole.getName());
        setAuths.add(new org.springframework.security.core.authority.SimpleGrantedAuthority(userRole.getName()));
    }
    java.util.List<org.springframework.security.core.GrantedAuthority> Result = new java.util.ArrayList<org.springframework.security.core.GrantedAuthority>(setAuths);
    return Result;
}