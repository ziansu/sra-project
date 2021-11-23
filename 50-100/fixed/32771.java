@org.springframework.context.annotation.Bean(name = "systemAuthorizingRealm")
public com.ggj.article.module.common.shiro.authc.SystemAuthorizingRealm getSystemAuthorizingRealm() {
    com.ggj.article.module.common.shiro.authc.SystemAuthorizingRealm sar = new com.ggj.article.module.common.shiro.authc.SystemAuthorizingRealm();
    sar.setCachingEnabled(true);
    sar.setAuthenticationCachingEnabled(false);
    sar.setAuthenticationCacheName("authenticationCache");
    sar.setAuthorizationCachingEnabled(true);
    sar.setAuthorizationCacheName("authorizationCache");
    org.apache.shiro.authc.credential.HashedCredentialsMatcher hcm = new org.apache.shiro.authc.credential.HashedCredentialsMatcher();
    hcm.setHashAlgorithmName(GlobalConstants.HASH_ALGORITHM_NMAE);
    hcm.setHashIterations(GlobalConstants.HASH_ITERATIONS);
    sar.setCredentialsMatcher(hcm);
    return sar;
}