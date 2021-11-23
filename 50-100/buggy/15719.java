public static com.codepath.insync.models.parse.User getUser(java.lang.String username) throws com.parse.ParseException {
    com.parse.ParseQuery<com.parse.ParseUser> query = com.parse.ParseUser.getQuery();
    query.whereEqualTo("username", username);
    java.util.List<com.parse.ParseUser> objects = query.find();
    com.parse.ParseUser parseUser = objects.get(0);
    com.codepath.insync.models.parse.User.user = new com.codepath.insync.models.parse.User(parseUser);
    return com.codepath.insync.models.parse.User.user;
}