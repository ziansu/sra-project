public static peaktech.set.User createInvalidUser() {
    peaktech.set.User user = new peaktech.set.User();
    user.withUserName("test").withPassword("test");
    return user;
}