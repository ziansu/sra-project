@java.lang.Override
public void run() {
    while (true) {
        ETPSYSTEM.ChannelValue x = new ETPSYSTEM.ChannelValue();
        x.type = "Tx";
        this.spotcheck.channel.out().write(x);
        java.lang.System.out.println("process A - sum2: Send x channel through spotcheck");
        ETPSYSTEM.Sum2A.repl2A rep = new ETPSYSTEM.Sum2A.repl2A(this.spotcheck, this.topa, this.y, this.ls, x);
        org.jcsp.lang.ProcessManager manager = new org.jcsp.lang.ProcessManager(rep);
        manager.start();
    } 
}