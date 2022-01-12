public static void logout() {
    cn.dreampie.security.Principal principal = cn.dreampie.security.Session.current().getPrincipal();
    if (principal != null) {
        cn.dreampie.security.cache.SessionCache.instance().remove(Principal.PRINCIPAL_DEF_KEY, principal.getUsername());
        cn.dreampie.security.Subject.logger.info(("Session leave authentication " + (principal.getUsername())));
    }
    cn.dreampie.security.Session.current().clearPrincipal();
}