@java.lang.Override
public javax.ws.rs.core.Response toResponse(javax.ws.rs.WebApplicationException e) {
    int status = e.getResponse().getStatus();
    java.lang.String message = e.getMessage();
    co.edu.unicartagena.platf.model.ErrorMessage errorMessage = new co.edu.unicartagena.platf.model.ErrorMessage(status, message);
    return javax.ws.rs.core.Response.fromResponse(e.getResponse()).entity(errorMessage).type(MediaType.APPLICATION_JSON).build();
}