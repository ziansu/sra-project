@java.lang.Override
public void run() {
    while (true) {
        this.z = ((ETPSYSTEM.ChannelValue) (this.topa.channel.in().read()));
        java.lang.System.out.println("process A - sum1: Received z channel through topa");
        ETPSYSTEM.Sum1A.repl1A repl = new ETPSYSTEM.Sum1A.repl1A(this.spotcheck, this.topa, this.z, this.l);
        org.jcsp.lang.ProcessManager manager = new org.jcsp.lang.ProcessManager(repl);
        manager.start();
    } 
}