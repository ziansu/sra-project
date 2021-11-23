@java.lang.Override
public org.springframework.data.domain.Page<E> findAll(org.springframework.data.domain.Example<E> example, org.springframework.data.domain.Pageable pageable) {
    return repository.findAll(example, pageable);
}