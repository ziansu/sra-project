public com.sun.jersey.api.client.ClientResponse updatePlain(int id, int userid, int courseid) throws com.sun.jersey.api.client.UniformInterfaceException {
    javax.ws.rs.core.MultivaluedMap queryParams = new com.sun.jersey.core.util.MultivaluedMapImpl();
    queryParams.add("id", java.lang.Integer.toString(id));
    queryParams.add("user_id", java.lang.Integer.toString(userid));
    queryParams.add("course_id", java.lang.Integer.toString(courseid));
    return webResource.queryParams(queryParams).path(java.text.MessageFormat.format("plain/update/{0}", new java.lang.Object[]{ id })).put(com.sun.jersey.api.client.ClientResponse.class);
}