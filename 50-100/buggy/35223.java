@java.lang.Override
public void onApplicationEvent(org.springframework.context.ApplicationEvent event) {
    if (event instanceof org.springframework.context.event.ContextRefreshedEvent) {
        org.springframework.context.ApplicationContext applicationContext = ((org.springframework.context.event.ContextRefreshedEvent) (event)).getApplicationContext();
        org.hawaiiframework.context.ApplicationContextHolder.bind(applicationContext);
    }else
        if (event instanceof org.springframework.context.event.ContextClosedEvent) {
            org.hawaiiframework.context.ApplicationContextHolder.release();
        }
    
}