@java.lang.Override
public org.springframework.http.ResponseEntity<de.fu_berlin.cdv.chasingpictures.api.LoginApiResult> send() {
    return restTemplate.exchange(apiUri, HttpMethod.POST, new org.springframework.http.HttpEntity(data), de.fu_berlin.cdv.chasingpictures.api.LoginApiResult.class);
}