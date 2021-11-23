public by.stub.yaml.stubs.StubRequest build() {
    final by.stub.yaml.stubs.StubRequest stubRequest = new by.stub.yaml.stubs.StubRequest(url, post, file, methods, headers, query);
    this.url = null;
    this.methods = new java.util.ArrayList<>();
    this.post = null;
    this.file = null;
    this.headers = new java.util.LinkedHashMap<>();
    this.query = new java.util.LinkedHashMap<>();
    return stubRequest;
}