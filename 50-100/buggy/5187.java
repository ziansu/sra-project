@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<?> addUser(@org.springframework.web.bind.annotation.RequestBody
java.util.Map<java.lang.String, java.lang.String> userSubmission) {
    if (userSubmission.containsKey("auth")) {
        byte[] jsonRepresentation = org.bouncycastle.util.encoders.Base64.decode(userSubmission.get("auth"));
        return new org.springframework.http.ResponseEntity(jsonRepresentation, org.springframework.http.HttpStatus.CREATED);
    }
    return new org.springframework.http.ResponseEntity<java.lang.Object>(org.springframework.http.HttpStatus.BAD_REQUEST);
}