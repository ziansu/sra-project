@java.lang.Override
public javax.ws.rs.core.Response toResponse(javax.ws.rs.WebApplicationException e) {
    co.edu.unicartagena.platf.model.ErrorMessage errorMessage = new co.edu.unicartagena.platf.model.ErrorMessage(e.getResponse().getStatus(), e.getMessage());
    return javax.ws.rs.core.Response.fromResponse(e.getResponse()).entity(errorMessage).type(MediaType.APPLICATION_JSON).build();
}