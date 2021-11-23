@java.lang.Override
public rest.module.Movieflix.Entity.Movies findOne(java.lang.String id) {
    rest.module.Movieflix.Entity.Movies existing = repository.findOne(id);
    return existing;
}