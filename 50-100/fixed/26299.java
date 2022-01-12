@java.lang.Override
public void setHeaders(java.lang.String[] headers) {
    this.headers = headers;
    if ((this.headers.length) == 0) {
        this.headers = new java.lang.String[1];
        this.headers[0] = "La tabella e' vuota";
    }
}