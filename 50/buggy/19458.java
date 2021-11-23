@java.lang.Override
public void onCompletion(java.lang.Throwable error, java.lang.Void result) {
    org.apache.kafka.connect.runtime.distributed.DistributedHerder.log.error("Unexpected error during task reconfiguration: ", error);
    org.apache.kafka.connect.runtime.distributed.DistributedHerder.log.error("Task reconfiguration for {} failed unexpectedly, this connector will not be properly reconfigured unless manually triggered.", connName);
}