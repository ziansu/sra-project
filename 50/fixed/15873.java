@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (null != (_listener)) {
        _listener.openFile();
        loci.slim.SLIMProcessor.record(SLIMProcessor.SET_START_BATCH, "");
    }
}