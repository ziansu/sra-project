@com.dotcms.repackage.javax.ws.rs.POST
@com.dotcms.repackage.javax.ws.rs.Produces(value = com.dotcms.repackage.javax.ws.rs.core.MediaType.APPLICATION_JSON)
@com.dotcms.repackage.javax.ws.rs.Consumes(value = { com.dotcms.repackage.javax.ws.rs.core.MediaType.APPLICATION_JSON })
@com.dotcms.repackage.javax.ws.rs.Path(value = "search")
public com.dotcms.repackage.javax.ws.rs.core.Response searchPost(@com.dotcms.repackage.javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request, java.lang.String esQuery) throws com.dotmarketing.exception.DotDataException, com.dotmarketing.exception.DotSecurityException {
    return search(request, esQuery);
}