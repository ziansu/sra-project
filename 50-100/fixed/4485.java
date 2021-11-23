@java.lang.Override
public void run() {
    while (!(java.lang.Thread.interrupted())) {
        try {
            message = in.readUTF();
            Client.console.log(("Got command " + (message)));
            throwCommand();
        } catch (java.lang.Exception e) {
            ru.universum.Client.Client.execute(new java.lang.String[]{ "connection" });
            interrupt();
        }
    } 
}