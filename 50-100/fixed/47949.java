@org.springframework.web.bind.annotation.CrossOrigin
@org.springframework.web.bind.annotation.RequestMapping(path = "/users/{id}/events", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.lang.Void> add(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id, @org.springframework.web.bind.annotation.RequestBody
com.eventos.model.Event event) {
    com.eventos.model.User user = this.userRepository.findOne(id);
    if (user != null) {
        event.setCreator(user);
        this.eventRepository.save(event);
        return new org.springframework.http.ResponseEntity<java.lang.Void>(org.springframework.http.HttpStatus.CREATED);
    }
    return new org.springframework.http.ResponseEntity<java.lang.Void>(org.springframework.http.HttpStatus.NOT_FOUND);
}