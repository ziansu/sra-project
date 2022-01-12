public void createUser(java.lang.String username, java.lang.String firstName, java.lang.String lastName, java.lang.String gender, java.lang.String email, java.lang.String pictureUrl, java.lang.String locale, java.lang.String providerId, java.lang.String provider) {
    www.purple.mixxy.models.User user = new www.purple.mixxy.models.User(username, firstName, lastName, gender, email, pictureUrl, locale, providerId, provider);
    objectify.get().save().entity(user).now();
}