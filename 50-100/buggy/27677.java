public static boolean isAdmin(com.willshex.blogwt.shared.api.datatype.User user) {
    java.util.List<com.willshex.blogwt.shared.api.datatype.Role> roles = ((user.roles) == null) ? com.willshex.blogwt.server.service.role.RoleServiceProvider.provide().getIdRolesBatch(com.willshex.blogwt.server.service.PersistenceService.keysToIds(user.roleKeys)) : user.roles;
    return ((user != null) && (roles != null)) && (com.willshex.blogwt.shared.helper.RoleHelper.toLookup(roles).containsKey(RoleHelper.ADMIN));
}