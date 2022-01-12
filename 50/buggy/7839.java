@java.lang.Override
public void run() {
    publishMessage(entry.getValue().getName(), entry.getValue().getTopic(), entry.getValue().getQos());
}