public domain.validate.ErrorList update(E entity) {
    domain.validate.ErrorList e = new domain.validate.ErrorList();
    if (entity instanceof domain.validate.Validate) {
        e = ((domain.validate.Validate) (entity)).validate();
    }
    if (e.isValid()) {
        getEntityManager().merge(entity);
    }
    return e;
}