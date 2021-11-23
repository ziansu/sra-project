public boolean senmMe() {
    boolean status = true;
    try {
        org.springframework.http.ResponseEntity<java.lang.String> ok = restTemplate.exchange(url, HttpMethod.POST, requestEntity, java.lang.String.class);
        if (!(ok.getBody().equals("ok")))
            status = false;
        
        errorSend = "Just has not sent!";
    } catch (org.springframework.web.client.RestClientException e) {
        errorSend = e.getMessage();
        status = false;
    }
    return status;
}