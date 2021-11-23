public static <T> com.wykst.cying.common.orm.BaseDao<T> getDao(java.lang.Class<T> entityClass) {
    com.wykst.cying.common.orm.ORM.checkInit();
    try {
        if (!(com.wykst.cying.common.orm.ORM.mDaoClassNameSet.contains(com.wykst.cying.common.orm.ORM.getDaoClassName(entityClass)))) {
            throw new java.lang.RuntimeException(("Unable to find dao class in the given packages for " + (entityClass.getName())));
        }
        return com.wykst.cying.common.orm.ORM.findDao(entityClass);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(("Unable to find dao class for " + (entityClass.getName())), e);
    }
}