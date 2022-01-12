public static void close() throws java.io.IOException {
    java.io.FileWriter in = new java.io.FileWriter(new java.io.File("./src/main/resources/users.csv"), false);
    for (model.User _user : services.UserDatabaseInterface.userData) {
        java.lang.String userInfo = (_user.toString()) + "\n";
        in.append(userInfo);
    }
    in.close();
}