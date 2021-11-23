@java.lang.Override
public void removeRefreshToken(org.springframework.security.oauth2.common.OAuth2RefreshToken token) {
    OAuth2AuthenticationRefreshToken refreshToken = oAuth2RefreshTokenRepository.findByTokenId(token.getValue());
    if (refreshToken != null) {
        oAuth2AccessTokenRepository.delete(refreshToken);
    }
}