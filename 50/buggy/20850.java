public com.jcabi.http.Request request() {
    return this.req.header(HttpHeaders.AUTHORIZATION, java.lang.String.format("token %s", this.atz.token()));
}