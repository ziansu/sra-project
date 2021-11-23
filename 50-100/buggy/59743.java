@org.junit.Test
public void decrypt() throws java.lang.Exception {
    java.lang.String hello = cwl.security.SecretKeySpecUse.encrypt("hello", myKey);
    cwl.security.SecretKeySpecUseTest.encrypt("edwin", "password");
    cwl.security.SecretKeySpecUseTest.decrypt("6VsVtA/nhHKUZuWWmod/BQ==");
    java.lang.String en = cwl.security.SecretKeySpecUseTest.encrypt1("edwin");
    cwl.security.SecretKeySpecUseTest.decrypt1(en, ("edwin" + "MY KEY"));
}