@org.junit.Test
@org.springframework.transaction.annotation.Transactional
@org.springframework.test.annotation.Rollback
public void addToken() throws java.lang.Exception {
    cat.xlagunas.andrtc.repository.model.Token token = new cat.xlagunas.andrtc.repository.model.Token.Builder().userId(userId).value("aToken").platform("ANDROID").build();
    tokenRepository.addToken(token.userId, token.value, token.platform);
    java.util.List<cat.xlagunas.andrtc.repository.model.Token> tokens = tokenRepository.getUserTokens(1);
    org.assertj.core.api.Assertions.assertThat(tokens).hasSize(1);
    org.assertj.core.api.Assertions.assertThat(tokens.get(0)).isEqualToIgnoringGivenFields(token, "id");
}