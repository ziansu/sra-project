public com.jcabi.http.Request request() {
    return this.req.header(HttpHeaders.AUTHORIZATION, this.atz.token());
}