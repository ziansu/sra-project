@java.lang.Override
public void filter(javax.ws.rs.container.ContainerRequestContext context) {
    boolean isSecurePath = isPathSecure(context);
    javax.ws.rs.core.UriInfo uriInfo = context.getUriInfo();
    java.lang.String path = uriInfo.getAbsolutePath().getPath();
    if ((isSecurePath && (path.contains("oauth2"))) || (path.contains("accounts/self"))) {
        if (isResourceOwnerRequest(context)) {
            handleResourceOwnerRequest(context);
        }else {
            super.filter(context);
        }
    }
}