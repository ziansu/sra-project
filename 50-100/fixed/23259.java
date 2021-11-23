@java.lang.Override
public void send(byte[] o) {
    uk.ac.imperial.lsds.seepworker.core.output.OutputBuffer outB = ob;
    if (SINGLE_SEND_NOT_DEFINED) {
        outB = this.router.route(outputBuffers);
    }
    boolean completed = true;
    while (completed) {
        completed = outB.write(o);
        if (completed) {
            eAPI.readyForWrite(outB.id());
        }
    } 
}