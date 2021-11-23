@io.robe.common.service.RobeService(group = "User", description = "Updates a single User matches with the given id.")
@io.robe.admin.resources.PUT
@io.dropwizard.hibernate.UnitOfWork
@io.robe.admin.resources.Path(value = "{id}")
public io.robe.admin.hibernate.entity.User update(@io.robe.auth.RobeAuth
io.robe.auth.Credentials credentials, @io.robe.admin.resources.PathParam(value = "id")
java.lang.String id, @javax.validation.Valid
io.robe.admin.hibernate.entity.User model) {
    if (!(id.equals(model.getOid()))) {
        throw new io.robe.admin.resources.WebApplicationException(javax.ws.rs.core.Response.status(412).build());
    }
    io.robe.admin.hibernate.entity.User entity = userDao.findById(id);
    if (entity == null) {
        throw new io.robe.admin.resources.WebApplicationException(javax.ws.rs.core.Response.status(404).build());
    }
    userDao.detach(entity);
    return userDao.update(model);
}