@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public E saveAndFlush(E entity) {
    entity = save(entity);
    repository.flush();
    return entity;
}