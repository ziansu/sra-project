@com.bls.resource.Path(value = "/{id}")
@com.bls.resource.DELETE
@io.dropwizard.hibernate.UnitOfWork
@com.codahale.metrics.annotation.Timed
@com.codahale.metrics.annotation.ExceptionMetered
public void delete(final com.bls.core.poi.Event event) {
    eventDao.delete(event);
}