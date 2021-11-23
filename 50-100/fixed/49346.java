public com.sun.jersey.api.client.ClientResponse createJson(java.lang.String userid, java.lang.String courseid) throws com.sun.jersey.api.client.UniformInterfaceException {
    javax.ws.rs.core.MultivaluedMap queryParams = new com.sun.jersey.core.util.MultivaluedMapImpl();
    queryParams.add("user_id", userid);
    queryParams.add("course_id", courseid);
    java.lang.System.out.println(queryParams.toString());
    com.sun.jersey.api.client.ClientResponse response = webResource.queryParams(queryParams).path("json/create").post(com.sun.jersey.api.client.ClientResponse.class);
    return response;
}