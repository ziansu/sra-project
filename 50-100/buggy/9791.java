@java.lang.Override
public void call(java.lang.reflect.Method method) {
    java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
    com.androidyuan.rxbus.component.Subscribe subscribeAnnotation = method.getAnnotation(com.androidyuan.rxbus.component.Subscribe.class);
    if (subscribeAnnotation != null) {
        java.lang.Class<?> eventType = parameterTypes[0];
        java.lang.String key = eventType.getName();
        com.androidyuan.rxbus.component.ThreadMode threadMode = subscribeAnnotation.threadMode();
        putObject(key, subscriber);
    }
}