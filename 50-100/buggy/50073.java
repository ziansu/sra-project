public static void init() {
    java.lang.Class<?>[] classList = new java.lang.Class<?>[]{ org.smart4j.framework.ClassHelper.class , org.smart4j.framework.BeanHelper.class , org.smart4j.framework.IocHelper.class , org.smart4j.framework.ControllerHelper.class , org.smart4j.framework.AopHelper.class };
    for (java.lang.Class<?> cls : classList) {
        org.smart4j.framework.util.ClassUtil.loadClass(cls.getName(), false);
    }
}