@java.lang.Override
public void readExternal(final java.io.ObjectInput in) throws java.io.IOException, java.lang.ClassNotFoundException {
    super.readExternal(in);
    final org.pac4j.oidc.profile.OidcProfile.BearerAccessTokenBean bean = ((org.pac4j.oidc.profile.OidcProfile.BearerAccessTokenBean) (in.readObject()));
    setAccessToken(org.pac4j.oidc.profile.OidcProfile.BearerAccessTokenBean.fromBean(bean));
    setIdTokenString(((java.lang.String) (in.readObject())));
}