@java.lang.Override
public void run() {
    if (terminating) {
        internalSubchannel.shutdown();
    }
    if (!(terminated)) {
        subchannels.add(internalSubchannel);
    }
}