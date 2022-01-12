@java.lang.Override
public boolean doAction(java.awt.event.ActionEvent e) {
    final icy.sequence.Sequence seq = icy.main.Icy.getMainInterface().getActiveSequence();
    if (seq != null) {
        final ij.ImagePlus ip = icy.imagej.ImageJUtil.convertToImageJImage(seq, progressFrame);
        icy.system.thread.ThreadUtil.invokeLater(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                ip.show();
            }
        });
        return true;
    }
    return false;
}