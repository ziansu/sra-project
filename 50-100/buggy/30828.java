public boolean hasMessageBody() throws java.io.IOException {
    org.springframework.http.HttpStatus responseStatus = this.getStatusCode();
    if (((responseStatus.is1xxInformational()) || (responseStatus == (org.springframework.http.HttpStatus.NO_CONTENT))) || (responseStatus == (org.springframework.http.HttpStatus.NOT_MODIFIED))) {
        return false;
    }else
        if ((this.getHeaders().getContentLength()) == 0) {
            return false;
        }
    
    return true;
}