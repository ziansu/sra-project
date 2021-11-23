public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.trch.ProcessManager processManager = com.trch.ProcessManager.getInstance();
    processManager.start();
    com.trch.IProcess process1 = new com.trch.Client.EchoProcess("process 1");
    processManager.startProcess(process1);
    com.trch.IProcess process2 = new com.trch.Client.EchoProcess("process 2");
    processManager.startProcess(process2);
    process1.sendMessage(new com.trch.Client.Echo(process2, "message from main method"));
    java.lang.Thread.sleep(java.lang.Integer.MAX_VALUE);
}