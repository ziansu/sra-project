public org.grpcvsrest.raggr.datasource.Content next() {
    if (done) {
        return null;
    }
    int contentId = lastContentId.incrementAndGet();
    org.grpcvsrest.raggr.datasource.Content result = datasource.fetch(contentId);
    if ((result.getNextId()) == null) {
        done = true;
    }
    return result;
}