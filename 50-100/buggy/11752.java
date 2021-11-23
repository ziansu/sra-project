@java.lang.SuppressWarnings(value = "rawtypes")
private java.util.List<java.lang.Class> getClass(java.lang.Class clazz, java.util.List<java.lang.Class> classList) {
    if ((clazz.getSuperclass()) != null) {
        if (com.ai.dubbo.ext.vo.BaseInfo.class.equals(clazz.getSuperclass().getName())) {
            return classList;
        }else {
            classList.add(clazz.getSuperclass());
            return getClass(clazz.getSuperclass(), classList);
        }
    }
    return classList;
}