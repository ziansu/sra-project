public com.sun.jersey.api.client.ClientResponse createJson(int userid, int courseid) throws com.sun.jersey.api.client.UniformInterfaceException {
    javax.ws.rs.core.MultivaluedMap queryParams = new com.sun.jersey.core.util.MultivaluedMapImpl();
    queryParams.add("user_id", java.lang.Integer.toString(userid));
    queryParams.add("course_id", java.lang.Integer.toString(courseid));
    java.lang.System.out.println(queryParams.toString());
    com.sun.jersey.api.client.ClientResponse response = webResource.queryParams(queryParams).path("json/create").post(com.sun.jersey.api.client.ClientResponse.class);
    return response;
}