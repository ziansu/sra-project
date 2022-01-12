public java.util.List getFriendships(java.lang.String username) {
    org.hibernate.Session s = this.plugin.getSession();
    org.hibernate.Query q = s.createQuery(("SELECT p2.username FROM Friendship f, Player p1, Player p2 WHERE " + "p1.username=:username AND f.playerUuid=p1.uuid AND p2.uuid=f.friendUuid"));
    q.setString("username", username);
    return q.list();
}