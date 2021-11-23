public void addUser(final java.lang.String email, final hw6.User user) throws java.lang.IllegalArgumentException {
    if ((email == null) || ((get(email)) != null)) {
        throw new java.lang.IllegalArgumentException();
    }
    put(email, user);
}