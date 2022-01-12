@java.lang.Override
public void run() {
    loc = ((ETPSYSTEM.ChannelValue) (read.channel.in().read()));
    java.lang.System.out.println("processO - sum1: Received loc through read");
    ETPSYSTEM.Sum1O.repl1O rep = new ETPSYSTEM.Sum1O.repl1O(this.spotcheck, this.topa, this.read, this.loc);
    org.jcsp.lang.ProcessManager manager = new org.jcsp.lang.ProcessManager(rep);
    manager.start();
}