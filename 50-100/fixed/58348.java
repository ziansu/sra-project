public com.sun.jersey.api.client.ClientResponse create(java.lang.String userid, java.lang.String courseid) throws com.sun.jersey.api.client.UniformInterfaceException {
    javax.ws.rs.core.MultivaluedMap queryParams = new com.sun.jersey.core.util.MultivaluedMapImpl();
    queryParams.add("user_id", userid);
    queryParams.add("course_id", courseid);
    com.sun.jersey.api.client.ClientResponse response = webResource.queryParams(queryParams).path("plain/create").post(com.sun.jersey.api.client.ClientResponse.class);
    return response;
}