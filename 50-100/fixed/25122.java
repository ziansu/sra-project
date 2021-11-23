@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent arg0) {
    if ((acquisitionRunning_.get()) && (org.micromanager.asidispim.Utils.MyDialogUtils.getConfirmDialogResult("Do you really want to abort the acquisition?", javax.swing.JOptionPane.YES_NO_OPTION))) {
        cancelAcquisition_.set(true);
        vad.getImagePlus().getWindow().dispose();
    }
    if (!(acquisitionRunning_.get())) {
        vad.getImagePlus().getWindow().dispose();
    }
}