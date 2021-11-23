@java.lang.Override
public void setProcessContext(com.reizes.shiva2.core.context.ProcessContext context) {
    this.context = context;
    this.thread.tasks.setProcessContext((this.thread.tasks.isShareProcessContext() ? context.clone() : new com.reizes.shiva2.core.context.ProcessContext()));
}