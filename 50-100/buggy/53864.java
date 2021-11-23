private javax.ws.rs.core.Response handleError(final java.lang.Throwable e) {
    if (e instanceof javax.ws.rs.WebApplicationException) {
        javax.ws.rs.WebApplicationException webE = ((javax.ws.rs.WebApplicationException) (e));
        return webE.getResponse();
    }
    java.io.StringWriter writer = new java.io.StringWriter();
    e.printStackTrace(new java.io.PrintWriter(writer));
    return javax.ws.rs.ext.RuntimeDelegate.getInstance().createResponseBuilder().status(HttpServletResponse.SC_INTERNAL_SERVER_ERROR).entity(writer.toString()).type(MediaType.TEXT_PLAIN_TYPE).build();
}