@java.lang.SuppressWarnings(value = "unchecked")
public void load() throws java.lang.Exception {
    serializer.read();
    movies = ((java.util.Map<java.lang.Long, models.Movie>) (serializer.pop()));
    usersEmails = ((java.util.Map<java.lang.String, models.User>) (serializer.pop()));
    usersIndices = ((java.util.Map<java.lang.Long, models.User>) (serializer.pop()));
}