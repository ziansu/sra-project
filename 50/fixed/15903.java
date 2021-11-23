@asg.cliche.Command(description = "Terminate the testclient")
public void quit() {
    if ((client) != null) {
        java.lang.System.out.println("Unregistering from broker");
        client.shutdown();
    }
    java.lang.System.out.println("Bye!");
    java.lang.System.exit(0);
}