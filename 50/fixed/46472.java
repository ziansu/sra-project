@java.lang.Override
public java.util.List<E> findAll(org.springframework.data.domain.Example<E> example, org.springframework.data.domain.Sort sort) {
    return repository.findAll(example, sort);
}