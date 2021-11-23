@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/json")
@javax.ws.rs.Produces(value = { "application/json" })
public java.lang.String addNewFilm(java.lang.String filmJson) {
    return filmService.addNewFilm(filmJson);
}