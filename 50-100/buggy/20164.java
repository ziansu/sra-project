public static java.lang.String toJson(java.util.List<net.whydah.sso.user.types.UserApplicationRoleEntry> roles) {
    java.lang.String rolesJson = "[";
    for (net.whydah.sso.user.types.UserApplicationRoleEntry role : roles) {
        rolesJson = (rolesJson + (net.whydah.sso.user.mappers.UserRoleMapper.toJson(role))) + ",";
    }
    rolesJson = (rolesJson.substring(0, ((rolesJson.length()) - 1))) + "]";
    return rolesJson;
}