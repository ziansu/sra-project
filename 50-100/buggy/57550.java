public java.lang.String getUuidForUsername(java.lang.String username) {
    org.hibernate.Session s = this.plugin.getSession();
    org.hibernate.Query q = s.createQuery("SELECT p.uuid FROM Player p WHERE username=?");
    q.setString(0, username);
    java.lang.Object result = q.uniqueResult();
    s.close();
    if (result == null) {
        return null;
    }
    return ((java.lang.String) (result));
}