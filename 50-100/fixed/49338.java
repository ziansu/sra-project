public void itemStateChanged(java.awt.event.ItemEvent e) {
    if (mleCheckBoxSummary.isSelected()) {
        FlagMLE = mrmc.gui.InputSummaryCard.USE_MLE;
    }else {
        FlagMLE = mrmc.gui.InputSummaryCard.NO_MLE;
    }
    DBRecordStat.flagMLE = FlagMLE;
    GUI.StatPanel1.resetStatPanel();
    GUI.StatPanel1.resetTable1();
    GUI.SizePanel1.resetSizePanel();
    if ((GUI.resetcall) == 0)
        varianceAnalysis();
    
}