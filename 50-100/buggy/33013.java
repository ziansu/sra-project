public void setFromEnum(fredboat.perms.PermissionLevel level, java.util.List<java.lang.String> list) {
    switch (level) {
        case ADMIN :
            setAdminList(list);
        case DJ :
            setDjList(list);
        case USER :
            setUserList(list);
        default :
            throw new java.lang.IllegalArgumentException(("Unexpected enum " + level));
    }
}