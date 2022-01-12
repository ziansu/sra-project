@org.junit.Test(expected = org.parse4j.ParseException.class)
public void signupExistingUsername() throws org.parse4j.ParseException {
    java.lang.System.out.println("signupExistingUsername(): initializing...");
    org.parse4j.ParseUser parseUser = getParseUser("2");
    parseUser.signUp();
    parseUser = getParseUser("2");
    parseUser.signUp();
    assertNotNull("objectId should not be null", parseUser.getObjectId());
    assertNotNull("createdAt should not be null", parseUser.getCreatedAt());
    assertNotNull("sessionToken should not be null", parseUser.getSessionToken());
}