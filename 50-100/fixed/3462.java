@java.lang.Override
public void run() {
    try {
        SOAPProcessStatus.INSTANCE.put(pid, "in progress");
        runnable.run();
        if (!(runnable.getErrors().isEmpty()))
            SOAPProcessStatus.INSTANCE.put(pid, runnable.getErrors());
        else
            SOAPProcessStatus.INSTANCE.put(pid, "success");
        
    } catch (java.lang.Exception e) {
        SOAPProcessStatus.INSTANCE.put(pid, "error");
    }
}