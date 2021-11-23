@java.lang.Override
public void execute(final java.lang.Runnable task, long startTimeout) {
    java.lang.Runnable enrichedTask = new amqp.spring.camel.component.SpringAMQPConsumer.SpringAMQPExecutorTask(endpoint, task);
    super.execute(enrichedTask, startTimeout);
}