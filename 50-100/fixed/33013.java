public void setFromEnum(fredboat.perms.PermissionLevel level, java.util.List<java.lang.String> list) {
    switch (level) {
        case ADMIN :
            setAdminList(list);
            break;
        case DJ :
            setDjList(list);
            break;
        case USER :
            setUserList(list);
            break;
        default :
            throw new java.lang.IllegalArgumentException(("Unexpected enum " + level));
    }
}