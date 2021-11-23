public static void init() {
    java.lang.Class<?>[] classList = new java.lang.Class<?>[]{ com.archexploration.smartframework.ClassHelper.class , com.archexploration.smartframework.BeanHelper.class , com.archexploration.smartframework.ControllerHelper.class , com.archexploration.smartframework.IocHelper.class };
    for (java.lang.Class<?> cls : classList) {
        com.archexploration.smartframework.util.ClassUtil.loadClass(cls.getName(), true);
    }
}