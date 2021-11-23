@java.lang.Override
public void run() {
    if (now == (pingedAt)) {
        if ((suspends == (suspendChanges.get())) && ((suspendCount.get()) > 0)) {
            handleFatalFailure(new java.lang.IllegalStateException("The connection has remained suspended for an extended period of time so it cannot do proper keep alive processing.  Did you forget to resume the connection?"));
        }else {
            mqtt.tracer.debug("Ping timeout");
        }
    }
}