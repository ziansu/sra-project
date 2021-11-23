protected long doGetContentSize() throws java.lang.Exception {
    return getS3Object(false).getContentLength();
}