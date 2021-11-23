@io.dropwizard.jersey.PATCH
@javax.ws.rs.Path(value = "/default/{id}")
public void updateUserDefault(@javax.ws.rs.PathParam(value = "id")
int id, io.progix.dropwizard.patch.DefaultJsonPatch<io.progix.dropwizard.patch.User> request) {
    io.progix.dropwizard.patch.User user = dao.getUsers().get(0);
    io.progix.dropwizard.patch.User patchedUser = request.apply(user);
    dao.getUsers().set(0, patchedUser);
}