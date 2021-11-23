@java.lang.Override
public void run(java.lang.String... args) throws java.lang.Exception {
    java.lang.Thread.sleep(1000);
    send(getFile("test.xml"));
    send(getFile("test1.xml"));
    java.lang.System.out.println("Message was sent to the Queue");
}