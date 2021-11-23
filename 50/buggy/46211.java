@com.gpdisingapura.timotius.ask.controller.RequestMapping(method = RequestMethod.POST, value = "/post")
org.springframework.http.ResponseEntity<java.lang.Void> postQuestionAnonymously(@com.gpdisingapura.timotius.ask.controller.RequestParam(value = "question")
java.lang.String q) {
    askService.postQuestionAnonymously(q);
    org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
    return new org.springframework.http.ResponseEntity<java.lang.Void>(headers, org.springframework.http.HttpStatus.CREATED);
}