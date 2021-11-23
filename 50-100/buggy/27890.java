public static java.lang.Class<?> findImplementClass(java.lang.Class<?> interfaceClass) {
    java.lang.Class<?> implementClass = interfaceClass;
    if (interfaceClass.isAnnotationPresent(org.xframework.ioc.annotation.Impl.class)) {
        implementClass = interfaceClass.getAnnotation(org.xframework.ioc.annotation.Impl.class).value();
    }else {
        java.util.List<java.lang.Class<?>> implementClassList = org.xframework.core.ClassHelper.getClassListBySuper(interfaceClass);
        if (org.apache.commons.collections4.CollectionUtils.isNotEmpty(implementClassList)) {
            implementClass = implementClassList.get(0);
        }
    }
    return implementClass;
}