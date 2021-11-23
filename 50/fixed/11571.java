@java.lang.Override
public E findOne(org.springframework.data.domain.Example<E> example) {
    return repository.findOne(example);
}