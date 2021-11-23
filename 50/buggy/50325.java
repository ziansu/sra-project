@java.lang.Override
public void completed(java.lang.Object result, java.lang.Object attachment) {
    java.lang.System.out.println((((attachment + " completed and ") + result) + " bytes are written."));
    sendPending = false;
}