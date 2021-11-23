public static org.openstack4j.api.OSClient invoke(org.openstack4j.model.identity.AuthStore auth, java.lang.String endpoint, org.openstack4j.api.types.Facing perspective, org.openstack4j.core.transport.Config config) {
    if ((auth.getVersion()) == (org.openstack4j.model.identity.AuthVersion.V2))
        return org.openstack4j.openstack.internal.OSAuthenticator.authenticateV2(((org.openstack4j.openstack.identity.domain.Auth) (auth.unwrap())), endpoint, perspective, false, config);
    
    return org.openstack4j.openstack.internal.OSAuthenticator.authenticateV3(((org.openstack4j.openstack.identity.domain.v3.KeystoneAuth) (auth.unwrap())), endpoint, perspective, config);
}