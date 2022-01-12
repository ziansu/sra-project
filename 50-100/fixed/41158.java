@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity CreateTopic(@org.springframework.web.bind.annotation.RequestBody
java.util.Map<java.lang.String, java.lang.String> body) {
    if (((body == null) || ((body.get("headline")) == null)) || ((body.get("headline").length()) > 255)) {
        return org.springframework.http.ResponseEntity.badRequest().build();
    }
    this.topicRepository.add(body.get("headline"));
    return org.springframework.http.ResponseEntity.status(HttpStatus.CREATED).build();
}