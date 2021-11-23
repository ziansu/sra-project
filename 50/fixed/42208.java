private com.pla.model.ModelDao<T> getDao() {
    return com.pla.model.ModelDaoFactory.getModelDao(getClass());
}