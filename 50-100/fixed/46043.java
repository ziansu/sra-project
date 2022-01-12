public it.geosolutions.geostore.services.rest.model.UserList getUsers(java.lang.Integer page, java.lang.Integer entries) {
    com.sun.jersey.api.client.WebResource wr = getBaseWebResource("users");
    return wr.queryParam("page", page.toString()).queryParam("entries", entries.toString()).header("Content-Type", MediaType.TEXT_XML).accept(MediaType.TEXT_XML).get(it.geosolutions.geostore.services.rest.model.UserList.class);
}