@java.lang.Override
public java.util.List<?> findListByAnd(java.lang.Class<?> entityClazz, java.util.Map<java.lang.String, java.lang.Object> andMap, java.util.List<java.lang.String> orderBy) throws org.huihoo.ofbiz.smart.entity.GenericEntityException {
    return findListByAnd(entityClazz, andMap, new java.util.HashSet<java.lang.String>(), new java.util.ArrayList<java.lang.String>(), false);
}