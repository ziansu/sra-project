@java.lang.Override
public org.backmeup.plugin.spi.Authorizable getAuthorizable(java.lang.String sourceSinkId, org.backmeup.plugin.spi.Authorizable.AuthorizationType authType) {
    switch (authType) {
        case OAuth :
            return service(org.backmeup.plugin.spi.OAuthBasedAuthorizable.class, (("(name=" + sourceSinkId) + ")"));
        case InputBased :
            return service(org.backmeup.plugin.spi.InputBasedAuthorizable.class, (("(name=" + sourceSinkId) + ")"));
        default :
            throw new java.lang.IllegalArgumentException(("unknown authorization type " + authType));
    }
}