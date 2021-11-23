public static void main(java.lang.String[] args) throws java.lang.Exception {
    model.UserAccess ua = new model.UserAccess();
    model.User user = ua.getUserByEmail("test");
    ua.deleteUser(user);
}