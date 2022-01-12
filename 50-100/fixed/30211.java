public static com.mayacarlsen.user.User getUserByUsername(java.lang.String username) {
    try (org.sql2o.Connection conn = com.mayacarlsen.user.UserDAO.sql2o.open()) {
        return conn.createQuery(com.mayacarlsen.user.UserDAO.SELECT_USER_BY_USERNAME_SQL).addParameter("username", username).executeAndFetchFirst(com.mayacarlsen.user.User.class);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}