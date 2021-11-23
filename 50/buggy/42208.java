private com.pla.model.ModelDao<T> getDao() {
    java.lang.Class<T> clazz = com.pla.utils.PojoUtil.getSuperClassGenricType(getClass());
    java.lang.String factoryBeanId = com.pla.utils.ModelUtil.getFactoryBeanId(clazz);
    return com.pla.model.ModelDaoFactory.getModelDao(factoryBeanId);
}