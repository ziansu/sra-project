@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void signupNoPassword() {
    java.lang.System.out.println("signupNoPassword(): initializing...");
    org.parse4j.ParseUser parseUser = new org.parse4j.ParseUser();
    try {
        parseUser.setUsername("parse4j-user");
        parseUser.signUp();
    } catch (org.parse4j.ParseException e) {
        assertNull("ParseException should be null", e);
    }
}