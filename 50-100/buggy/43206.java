public models.User addUser(java.lang.String firstName, java.lang.String lastName, java.lang.String gender, java.lang.String age, java.lang.String occupation) {
    models.User user = new models.User(firstName, lastName, gender, age, occupation);
    userIndex.put(user.id, user);
    return user;
}