public domain.validate.ErrorList create(E entity) {
    domain.validate.ErrorList e = new domain.validate.ErrorList();
    if (entity instanceof domain.validate.Validate) {
        e = ((domain.validate.Validate) (entity)).validate();
    }
    if (!(e.isValid())) {
        getEntityManager().persist(entity);
    }
    return e;
}