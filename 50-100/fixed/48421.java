@java.lang.Override
public void run() {
    this.mar.setValue(pc.getValue());
    this.pc.setValue(((pc.getValue()) + 1));
    this.instruction = this.memory.getInstruction(mar.getValue());
    if ((this.instruction) == null) {
        this.end = true;
        return ;
    }
    java.lang.System.out.println(("Fetching " + (mar.getValue())));
}