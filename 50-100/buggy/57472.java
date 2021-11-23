@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void signupWithObjectId() {
    java.lang.System.out.println("signupWithObjectId(): initializing...");
    org.parse4j.ParseUser parseUser = new org.parse4j.ParseUser();
    try {
        parseUser.setUsername("parse4j-user");
        parseUser.setPassword("parse4j-password");
        parseUser.setObjectId("tempObjectId");
        parseUser.signUp();
    } catch (org.parse4j.ParseException e) {
        org.junit.Assert.assertNull("ParseException should be null", e);
    }
}