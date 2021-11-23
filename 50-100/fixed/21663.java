public void itemStateChanged(java.awt.event.ItemEvent e) {
    if (mleCheckBox.isSelected()) {
        FlagMLE = mrmc.gui.InputFileCard.USE_MLE;
    }else {
        FlagMLE = mrmc.gui.InputFileCard.NO_MLE;
    }
    DBRecordStat.flagMLE = FlagMLE;
    GUI.StatPanel1.resetStatPanel();
    GUI.StatPanel1.resetTable1();
    GUI.SizePanel1.resetSizePanel();
}