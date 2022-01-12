private int getIntegerHeader(java.lang.String h) {
    if (this.hasHeader(h)) {
        ch.boye.httpclientandroidlib.Header header = this.response.getFirstHeader(h);
        return java.lang.Integer.parseInt(header.getValue(), 10);
    }
    return -1;
}