@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    if (owner.isBatchMode()) {
        return ;
    }
    if (isGenerating()) {
        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        owner.alert(owner.getResource("error.close.window", "Please wait until generating process will be finished."));
        return ;
    }
    setDefaultCloseOperation(javax.swing.JFrame.HIDE_ON_CLOSE);
}