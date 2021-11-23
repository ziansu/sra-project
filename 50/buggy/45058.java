@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public <S extends E> S save(S entity) {
    return repository.save(entity);
}