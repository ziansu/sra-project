@org.junit.Test
public void decrypt() throws java.lang.Exception {
    java.lang.String hello = cwl.security.SecretKeySpecUse.encrypt("hello", myKey);
    assertEquals("hello", cwl.security.SecretKeySpecUse.decrypt(hello, myKey));
    cwl.security.SecretKeySpecUseTest.encrypt("edwin", "password");
    cwl.security.SecretKeySpecUseTest.decrypt("6VsVtA/nhHKUZuWWmod/BQ==");
}