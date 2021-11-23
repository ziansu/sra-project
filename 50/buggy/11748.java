public static void adminAuthorization(java.lang.String groups) {
    if (org.springframework.util.StringUtils.isEmpty(groups)) {
        throw new com.lifeix.football.common.exception.AuthorizationException();
    }
    if (!(groups.contains("admin"))) {
        throw new com.lifeix.football.common.exception.AuthorizationException();
    }
}