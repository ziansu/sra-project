@org.junit.Test
public void shouldNotErrorOutWhenValidationIsSuccessfulForSecureVariables() throws org.bouncycastle.crypto.InvalidCipherTextException {
    java.lang.String plainText = "secure_value";
    java.lang.String cipherText = "cipherText";
    org.mockito.Mockito.when(goCipher.encrypt(plainText)).thenReturn(cipherText);
    org.mockito.Mockito.when(goCipher.decrypt(cipherText)).thenReturn(plainText);
    com.thoughtworks.go.config.EnvironmentVariableConfig environmentVariableConfig = new com.thoughtworks.go.config.EnvironmentVariableConfig(goCipher, "secure_key", plainText, true);
    environmentVariableConfig.validate(null);
    org.junit.Assert.assertThat(environmentVariableConfig.errors().isEmpty(), org.hamcrest.core.Is.is(true));
}