public javax.ws.rs.core.Response toResponse(javax.ws.rs.BadRequestException exception) {
    return javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).type(MediaType.TEXT_PLAIN).build();
}