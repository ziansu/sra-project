public static boolean promoteUser(int id, sk.tsystems.forum.entity.UserRole role) {
    try (sk.tsystems.forum.service.jpa.JpaConnector jpa = new sk.tsystems.forum.service.jpa.JpaConnector()) {
        sk.tsystems.forum.entity.User user = jpa.getEntityManager().find(sk.tsystems.forum.entity.User.class, id);
        if (user == null) {
            return false;
        }
        user.setRole(role);
        jpa.merge(user);
    }
    return true;
}