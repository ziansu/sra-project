void setup(java.lang.String url) {
    this.url = url;
    java.net.URL u = null;
    try {
        u = new java.net.URL(url);
        if ((u.getUserInfo()) == null)
            throw new java.lang.Exception("No user:password specified");
        
        cred = new org.apache.http.auth.UsernamePasswordCredentials(u.getUserInfo());
        ucar.httpservices.HTTPSession.setGlobalCredentials(cred);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}