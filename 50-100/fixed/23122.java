private void launchFacultyNotFound(java.lang.Integer id) throws javax.ws.rs.NotFoundException {
    java.lang.String msg = java.lang.String.format("The faculty with id %d not found.", id);
    co.edu.unicartagena.platf.model.ErrorMessage em = new co.edu.unicartagena.platf.model.ErrorMessage(404, msg);
    javax.ws.rs.core.Response response = javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).entity(em).build();
    throw new javax.ws.rs.NotFoundException(response);
}