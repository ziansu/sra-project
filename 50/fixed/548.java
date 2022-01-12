@java.lang.Override
public com.ocean.reactservices.model.Recipe create(com.ocean.reactservices.model.Recipe model) {
    openCurrentSessionwithTransaction();
    getCurrentSession().save(model);
    closeCurrentSessionwithTransaction();
    return read(model.getId());
}