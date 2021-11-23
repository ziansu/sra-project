protected void init(org.apache.http.auth.AuthScope scope, java.lang.String actualurl) throws ucar.httpservices.HTTPException {
    assert scope != null;
    if (actualurl == null)
        this.sessionURI = actualurl;
    else
        this.sessionURI = ucar.httpservices.HTTPAuthUtil.authscopeToURI(scope).toString();
    
    this.scope = scope;
    this.scopeURI = ucar.httpservices.HTTPAuthUtil.authscopeToURI(scope);
    this.cachevalid = false;
    this.sessioncontext.setCookieStore(new ucar.httpservices.BasicCookieStore());
    this.sessioncontext.setAttribute(HttpClientContext.AUTH_CACHE, new ucar.httpservices.BasicAuthCache());
}