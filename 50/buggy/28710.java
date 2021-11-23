public static com.baronhub.titan.project.common.enums.Permission getProfileType(java.lang.String perm) {
    switch (perm) {
        case "Admin" :
            return com.baronhub.titan.project.common.enums.Permission.ADMIN;
        default :
            return com.baronhub.titan.project.common.enums.Permission.USER;
    }
}