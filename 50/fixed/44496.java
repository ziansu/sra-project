@de.escalon.hypermedia.action.Action(value = "GiveAction")
@app.controllers.RequestMapping(value = "/{id}", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<org.springframework.hateoas.Resource> getUser(@app.controllers.PathVariable
int id) {
    return new org.springframework.http.ResponseEntity<org.springframework.hateoas.Resource>(buildUserResource(0, "Mika Penniman"), org.springframework.http.HttpStatus.OK);
}