@java.lang.Override
public void adjustmentValueChanged(java.awt.event.AdjustmentEvent adjustmentEvent) {
    if (adjustmentEvent.getValueIsAdjusting()) {
        return ;
    }
    if ((adjustmentEvent.getAdjustmentType()) != (java.awt.event.AdjustmentEvent.TRACK)) {
        return ;
    }
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        public void run() {
            currentLineStart = adjustmentEvent.getValue();
            spinnerAddress.setValue(((utilities.hexEdit.HexEditPanelBase.BYTES_PER_LINE) * (currentLineStart)));
            fillPane();
        }
    });
}