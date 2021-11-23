@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public rest.module.Movieflix.Entity.Movies findOne(java.lang.String id) {
    return repository.findOne(id);
}