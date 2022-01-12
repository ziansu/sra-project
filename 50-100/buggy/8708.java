@java.lang.Override
public void run() {
    this.s = ((ETPSYSTEM.ChannelValue) (this.spotcheck.channel.in().read()));
    java.lang.System.out.println("ProcessO - sum2: Received s through spotcheck");
    ETPSYSTEM.Sum2O.repl2O rep = new ETPSYSTEM.Sum2O.repl2O(this.spotcheck, this.topa, this.read, this.s, this.ls);
    org.jcsp.lang.ProcessManager manager = new org.jcsp.lang.ProcessManager(rep);
    manager.start();
}