public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.trch.ProcessManager.start();
    com.trch.IProcess process1 = new com.trch.Client.EchoProcess("process 1");
    com.trch.ProcessManager.startProcess(process1);
    com.trch.IProcess process2 = new com.trch.Client.EchoProcess("process 2");
    com.trch.ProcessManager.startProcess(process2);
    process1.sendMessage(new com.trch.Client.Echo(process2, "message from main method"));
    process2.sendMessage(new com.trch.Client.Echo(process1, "message from main method"));
    java.lang.Thread.sleep(java.lang.Integer.MAX_VALUE);
}