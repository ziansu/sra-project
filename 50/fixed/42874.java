@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
public java.lang.String generateKey(@org.springframework.web.bind.annotation.RequestHeader(value = "project-id")
java.lang.String projectId, @org.springframework.web.bind.annotation.RequestBody
java.lang.String name) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {
    return keyManagement.generateKey(projectId, name);
}