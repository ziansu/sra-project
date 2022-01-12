@de.escalon.hypermedia.action.Action(value = "GiveAction")
@app.controllers.RequestMapping(value = "/{id}", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<org.springframework.hateoas.Resource<app.entities.Book>> getBook(@app.controllers.PathVariable
int id) {
    return new org.springframework.http.ResponseEntity<org.springframework.hateoas.Resource<app.entities.Book>>(buildBookResource(0, "Harry Potter"), org.springframework.http.HttpStatus.OK);
}