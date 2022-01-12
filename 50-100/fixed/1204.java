@org.junit.Test
public void decryptError() throws com.homework1.task5.UnavailableFunctionalityException {
    com.homework1.task5.RSA rsaConfigured = new com.homework1.task5.RSA(rsa.getOpenExponent(), rsa.getModule());
    thrown.expect(com.homework1.task5.UnavailableFunctionalityException.class);
    thrown.expectMessage(MESSAGE);
    rsaConfigured.decrypt(input);
}