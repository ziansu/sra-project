@java.lang.Override
public void run() {
    if (terminating) {
        internalSubchannel.shutdown();
    }else
        if (!(terminated)) {
            subchannels.add(internalSubchannel);
        }
    
}