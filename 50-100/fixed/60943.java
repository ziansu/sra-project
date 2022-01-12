@java.lang.Override
public hudson.security.SecurityComponents createSecurityComponents() {
    hudson.security.AbstractPasswordBasedSecurityRealm.Authenticator authenticator = new hudson.security.AbstractPasswordBasedSecurityRealm.Authenticator();
    org.springframework.security.authentication.RememberMeAuthenticationProvider rememberMeAuthenticationProvider = new org.springframework.security.authentication.RememberMeAuthenticationProvider();
    rememberMeAuthenticationProvider.setKey(org.eclipse.hudson.security.HudsonSecurityEntitiesHolder.getHudsonSecurityManager().getSecretKey());
    org.springframework.security.authentication.AnonymousAuthenticationProvider anonymousAuthenticationProvider = new org.springframework.security.authentication.AnonymousAuthenticationProvider();
    anonymousAuthenticationProvider.setKey("anonymous");
    org.springframework.security.authentication.AuthenticationProvider[] authenticationProvider = new org.springframework.security.authentication.AuthenticationProvider[]{ authenticator , rememberMeAuthenticationProvider , anonymousAuthenticationProvider };
    org.springframework.security.authentication.ProviderManager providerManager = new org.springframework.security.authentication.ProviderManager();
    providerManager.setProviders(java.util.Arrays.asList(authenticationProvider));
    return new hudson.security.SecurityComponents(providerManager, this);
}