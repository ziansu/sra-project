@java.lang.Override
public void onCompleted() {
    localLog.trace("Completed retrieving messages - poll again");
    doPoll();
}