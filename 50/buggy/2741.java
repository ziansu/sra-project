public void reset() throws java.lang.Exception {
    getStream("state").truncate(0);
    getStream("output").truncate(0);
}