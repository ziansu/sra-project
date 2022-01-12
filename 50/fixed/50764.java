protected java.io.InputStream doGetInputStream() throws java.lang.Exception {
    return getS3Object(false, true).getDataInputStream();
}