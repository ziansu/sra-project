public org.apache.hc.client5.http.fluent.Executor authPreemptive(final org.apache.hc.core5.http.HttpHost host) {
    if ((this.credentialsStore) != null) {
        final org.apache.hc.client5.http.auth.Credentials credentials = this.credentialsStore.getCredentials(new org.apache.hc.client5.http.auth.AuthScope(host));
        if (credentials == null) {
            final org.apache.hc.client5.http.impl.auth.BasicScheme basicScheme = new org.apache.hc.client5.http.impl.auth.BasicScheme();
            basicScheme.initPreemptive(credentials);
            this.authCache.put(host, basicScheme);
        }
    }
    return this;
}