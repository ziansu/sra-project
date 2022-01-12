public void execute(org.ikasan.component.endpoint.quartz.consumer.JobExecutionContext context) {
    try {
        T message = ((T) (messageProvider.invoke(context)));
        if (message != null) {
            org.ikasan.spec.flow.FlowEvent<?, ?> flowEvent = createFlowEvent(message);
            this.eventListener.invoke(flowEvent);
        }else {
            if (managedResourceRecoveryManager.isRecovering()) {
                managedResourceRecoveryManager.cancel();
            }
        }
    } catch (java.lang.Throwable thr) {
        managedResourceRecoveryManager.recover(thr);
    }
}