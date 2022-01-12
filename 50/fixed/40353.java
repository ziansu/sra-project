@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public <S extends T> java.lang.Iterable<S> saveAll(java.lang.Iterable<S> entities) {
    session.save(entities);
    return entities;
}