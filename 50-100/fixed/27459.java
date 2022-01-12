@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.lang.Long startTime = java.lang.System.currentTimeMillis();
    com.xiaojinzi.viewinjection.annotation.ViewInjectionUtil.injectView(this);
    java.lang.Long endTime = java.lang.System.currentTimeMillis();
    java.lang.System.out.println(("注解花费的时间(单位:毫秒):" + (endTime - startTime)));
}