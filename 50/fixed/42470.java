@java.lang.Override
public com.ocean.reactservices.model.Recipe read(java.lang.Integer id) {
    openCurrentSessionwithTransaction();
    com.ocean.reactservices.model.Recipe value = ((com.ocean.reactservices.model.Recipe) (getCurrentSession().get(com.ocean.reactservices.model.Recipe.class, id)));
    closeCurrentSessionwithTransaction();
    return value;
}