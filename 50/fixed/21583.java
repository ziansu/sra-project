public com.rw.velocity.RequestBuilder withJsonBody(java.lang.Object toJsonObect) {
    this.rawParams = new com.google.gson.Gson().toJson(toJsonObect);
    this.contentType = Velocity.ContentType.JSON.toString();
    return this;
}