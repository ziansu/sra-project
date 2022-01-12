public static User userNamePasswordLookUp(java.lang.String username, java.lang.String password) {
    int userLookUpID = 0;
    for (User user : User.all()) {
        java.lang.System.out.println(user.getUserName());
        if ((user.getUserName().equals(username)) && (user.getPassword().equals(password))) {
            userLookUpID = user.getId();
        }
    }
    return User.find(userLookUpID);
}