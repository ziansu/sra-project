protected void setUpUser(java.lang.String name, java.lang.String email, java.lang.String image) {
    user = new com.sarahrobinson.finalyearproject.classes.User();
    user.setEmail(email);
    user.setName(name);
    user.setImage(image);
    user.setFavouritePlaces(null);
}