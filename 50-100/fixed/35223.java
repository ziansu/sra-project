@java.lang.Override
public void onApplicationEvent(org.springframework.context.ApplicationEvent event) {
    if (event instanceof org.springframework.context.event.ContextRefreshedEvent) {
        if ((org.hawaiiframework.context.ApplicationContextHolder.getApplicationContext()) != null) {
            org.hawaiiframework.context.ApplicationContextHolder.release();
        }
        org.springframework.context.ApplicationContext applicationContext = ((org.springframework.context.event.ContextRefreshedEvent) (event)).getApplicationContext();
        org.hawaiiframework.context.ApplicationContextHolder.bind(applicationContext);
    }else
        if (event instanceof org.springframework.context.event.ContextClosedEvent) {
            org.hawaiiframework.context.ApplicationContextHolder.release();
        }
    
}