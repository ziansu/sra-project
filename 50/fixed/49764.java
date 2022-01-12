public void persistSession(java.lang.String domainCookieName) {
    sessionDAO.registerNewSession(this, domainCookieName);
}