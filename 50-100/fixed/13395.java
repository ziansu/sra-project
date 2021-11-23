@org.apache.shiro.event.Subscribe
public void onEvent(org.apache.shiro.config.event.BeanEvent e) {
    java.lang.String className = e.getClass().getSimpleName();
    int i = className.lastIndexOf(org.apache.shiro.config.event.LoggingBeanEventListener.SUFFIX);
    java.lang.String subclassPrefix = (i > 0) ? className.substring(0, i) : className;
    org.apache.shiro.config.event.LoggingBeanEventListener.logger.trace("{} bean '{}' [{}]", new java.lang.Object[]{ subclassPrefix , e.getBeanName() , e.getBean() });
}