@org.junit.Test(expected = org.parse4j.ParseException.class)
public void signupExistingUsername() throws org.parse4j.ParseException {
    java.lang.System.out.println("signupExistingUsername(): initializing...");
    try {
        org.parse4j.ParseUser parseUser = getParseUser("2");
        parseUser.signUp();
        parseUser = getParseUser("2");
        parseUser.signUp();
        org.junit.Assert.assertNotNull("objectId should not be null", parseUser.getObjectId());
        org.junit.Assert.assertNotNull("createdAt should not be null", parseUser.getCreatedAt());
        org.junit.Assert.assertNotNull("sessionToken should not be null", parseUser.getSessionToken());
    } catch (org.parse4j.ParseException e) {
        throw e;
    }
}