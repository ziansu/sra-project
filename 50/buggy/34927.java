@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public <S extends E> java.util.List<S> save(java.lang.Iterable<S> entities) {
    return repository.save(entities);
}