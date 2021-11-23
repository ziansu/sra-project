protected javax.ws.rs.core.Response build(javax.ws.rs.core.Response.Status status) {
    return javax.ws.rs.core.Response.status(status).header(de.hwrberlin.it2014.sweproject.rest.Resource.ALLOW_ORIGIN_HEADER, de.hwrberlin.it2014.sweproject.rest.Resource.WILDCARD).build();
}