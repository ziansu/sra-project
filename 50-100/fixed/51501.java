public static void myWalls() {
    java.lang.String username = Secure.Security.connected();
    models.User currentUser = models.User.find("byUsername", username).first();
    int indexOfWall = currentUser.getIndex();
    if (validation.hasErrors()) {
        params.flash();
        validation.keep();
    }
    render(currentUser, indexOfWall);
}