public by.stub.yaml.stubs.StubRequest build() {
    final by.stub.yaml.stubs.StubRequest stubRequest = new by.stub.yaml.stubs.StubRequest(url, post, file, methods, headers, query);
    this.url = null;
    this.methods = new java.util.ArrayList<java.lang.String>();
    this.post = null;
    this.file = null;
    this.headers = new java.util.HashMap<java.lang.String, java.lang.String>();
    this.query = new java.util.LinkedHashMap<java.lang.String, java.lang.String>();
    return stubRequest;
}