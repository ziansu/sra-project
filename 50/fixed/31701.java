public static boolean checkIsUserSignedIn(io.objectbox.Box<de.opti4apps.timelytest.data.User> usersBox) {
    de.opti4apps.timelytest.data.User user = usersBox.query().equal(User_.isSingedIn, true).build().findFirst();
    return user != null;
}