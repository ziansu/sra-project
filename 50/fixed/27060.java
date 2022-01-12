@java.lang.Override
public void onApplicationEvent(org.springframework.context.event.ContextRefreshedEvent arg0) {
    this.locator = org.lexevs.locator.LexEvsServiceLocator.getInstance();
    try {
        lazyLoadMetadata();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}