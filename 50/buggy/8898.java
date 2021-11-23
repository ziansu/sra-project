@java.lang.Override
@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRES_NEW)
public <S extends E> S saveAndCommit(S entity) {
    return saveAndFlush(entity);
}