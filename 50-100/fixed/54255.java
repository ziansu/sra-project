@io.robe.common.service.RobeService(group = "JobEntity", description = "Update a JobEntity resource with the matches given id.")
@io.dropwizard.jersey.PATCH
@io.dropwizard.hibernate.UnitOfWork
@io.robe.admin.resources.Path(value = "{id}")
public io.robe.admin.quartz.hibernate.JobEntity merge(@io.robe.auth.RobeAuth
io.robe.auth.Credentials credentials, @io.robe.admin.resources.PathParam(value = "id")
java.lang.String id, io.robe.admin.quartz.hibernate.JobEntity model) {
    if (!(id.equals(model.getOid())))
        throw new io.robe.admin.resources.WebApplicationException(javax.ws.rs.core.Response.status(412).build());
    
    io.robe.admin.quartz.hibernate.JobEntity dest = quartzJobDao.findById(id);
    if (dest == null) {
        throw new io.robe.admin.resources.WebApplicationException(javax.ws.rs.core.Response.status(404).build());
    }
    io.robe.common.utils.FieldReflection.mergeRight(model, dest);
    return quartzJobDao.update(dest);
}