public static com.baronhub.titan.project.common.enums.Permission getProfileType(java.lang.String perm) {
    if (perm.equals("Admin"))
        return com.baronhub.titan.project.common.enums.Permission.ADMIN;
    
    return com.baronhub.titan.project.common.enums.Permission.USER;
}