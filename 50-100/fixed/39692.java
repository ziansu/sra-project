public static java.util.List<java.lang.String> getGroups(final java.lang.String user) throws java.io.IOException {
    if ((io.hops.security.UsersGroups.cached) == null) {
        return null;
    }
    java.util.List<java.lang.String> groups = io.hops.security.UsersGroups.cached.get(user);
    if (groups == null) {
        groups = io.hops.security.UsersGroups.getGroupsFromDB(user);
        if (groups != null) {
            io.hops.security.UsersGroups.cached.put(user, groups);
        }
    }
    return groups;
}