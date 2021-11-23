private uk.gov.gchq.gaffer.user.User createUser() {
    java.lang.System.out.println(userFactory.getClass());
    return userFactory.createUser();
}