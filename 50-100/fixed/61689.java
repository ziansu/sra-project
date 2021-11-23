@org.junit.Test
public void areNotEqual() {
    java.util.Date creationDate = new java.util.Date();
    com.clouway.oauth2.token.Token token1 = new com.clouway.oauth2.token.Token("value1", TokenType.BEARER, "refreshToken", "identityId", 1L, creationDate);
    com.clouway.oauth2.token.Token token2 = new com.clouway.oauth2.token.Token("value2", TokenType.BEARER, "refreshToken", "identityId", 1L, creationDate);
    org.junit.Assert.assertThat(token1, org.hamcrest.Matchers.is(org.hamcrest.Matchers.not(token2)));
}