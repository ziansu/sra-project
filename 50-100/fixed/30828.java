public boolean hasMessageBody() throws java.io.IOException {
    org.springframework.http.HttpStatus responseStatus = this.getStatusCode();
    if (((responseStatus.is1xxInformational()) || (responseStatus == (org.springframework.http.HttpStatus.NO_CONTENT))) || (responseStatus == (org.springframework.http.HttpStatus.NOT_MODIFIED))) {
        return false;
    }
    return (this.getHeaders().getContentLength()) > 0;
}