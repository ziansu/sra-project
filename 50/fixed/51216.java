@org.junit.Test
public void passwordValidationTest() {
    snapchattapp.texnlog.com.snapchatapp.accountValidator av = new snapchattapp.texnlog.com.snapchatapp.accountValidator();
    boolean results = av.isPasswordValid("123456akdb523");
    assertTrue(results);
}