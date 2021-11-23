@com.gpdisingapura.timotius.ask.controller.RequestMapping(method = RequestMethod.POST, value = "/postBy")
org.springframework.http.ResponseEntity<java.lang.Void> postQuestion(@com.gpdisingapura.timotius.ask.controller.RequestParam(value = "postedBy")
java.lang.String postedBy, @com.gpdisingapura.timotius.ask.controller.RequestParam(value = "title")
java.lang.String title, @com.gpdisingapura.timotius.ask.controller.RequestParam(value = "question")
java.lang.String q) {
    askService.postQuestion(postedBy, title, q);
    org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
    return new org.springframework.http.ResponseEntity<java.lang.Void>(headers, org.springframework.http.HttpStatus.CREATED);
}