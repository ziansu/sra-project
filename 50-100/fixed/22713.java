public static boolean checkUserCredentials(io.objectbox.Box<de.opti4apps.timelytest.data.User> usersBox, java.lang.String email, java.lang.String password) {
    de.opti4apps.timelytest.data.User user = usersBox.query().equal(User_.email, email).equal(User_.password, password).build().findFirst();
    return user != null;
}