public com.wrapper.spotify.methods.CategoryRequest build() {
    path("/v1/recommendations/available-genre-seeds");
    return new com.wrapper.spotify.methods.CategoryRequest(this);
}