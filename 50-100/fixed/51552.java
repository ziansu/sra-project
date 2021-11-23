@java.lang.Override
public void onApplicationEvent(org.springframework.context.ApplicationEvent applicationEvent) {
    if (applicationEvent instanceof org.springframework.boot.context.event.ApplicationFailedEvent) {
        this.applicationFailedEvent = ((org.springframework.boot.context.event.ApplicationFailedEvent) (applicationEvent));
        doTaskEnd();
    }else
        if (applicationEvent instanceof org.springframework.boot.ExitCodeEvent) {
            this.exitCodeEvent = ((org.springframework.boot.ExitCodeEvent) (applicationEvent));
            doTaskEnd();
        }else
            if (applicationEvent instanceof org.springframework.boot.context.event.ApplicationReadyEvent) {
                doTaskEnd();
            }
        
    
}