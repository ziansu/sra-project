@ar.edu.unq.desapp.grupoC.restServices.GET
@ar.edu.unq.desapp.grupoC.restServices.Consumes(value = "application/json")
@ar.edu.unq.desapp.grupoC.restServices.Produces(value = "application/json")
@java.lang.SuppressWarnings(value = "unchecked")
@ar.edu.unq.desapp.grupoC.restServices.Path(value = "/show")
public org.springframework.http.ResponseEntity show(@ar.edu.unq.desapp.grupoC.restServices.FormParam(value = "email")
final java.lang.String email, @ar.edu.unq.desapp.grupoC.restServices.FormParam(value = "password")
final java.lang.String password) {
    ar.edu.unq.desapp.grupoC.model.user.User user = null;
    try {
        user = this.getService().show(email, password);
    } catch (java.lang.Exception e) {
        return new org.springframework.http.ResponseEntity(e.getMessage(), org.springframework.http.HttpStatus.NOT_FOUND);
    }
    return new org.springframework.http.ResponseEntity(user, org.springframework.http.HttpStatus.OK);
}