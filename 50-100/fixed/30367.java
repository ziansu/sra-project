@org.springframework.cloud.client.loadbalancer.LoadBalanced
@org.springframework.context.annotation.Bean
public org.springframework.security.oauth2.client.OAuth2RestTemplate rpInternalRestTemplate(org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails resource, org.springframework.security.oauth2.client.OAuth2ClientContext context) {
    org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails clientCredentialsResourceDetails = new org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails();
    clientCredentialsResourceDetails.setClientId(oauthClientProperties.getClientId());
    clientCredentialsResourceDetails.setClientSecret(oauthClientProperties.getClientSecret());
    clientCredentialsResourceDetails.setAccessTokenUri(resource.getAccessTokenUri());
    clientCredentialsResourceDetails.setScope(resource.getScope());
    return new org.springframework.security.oauth2.client.OAuth2RestTemplate(clientCredentialsResourceDetails, context);
}