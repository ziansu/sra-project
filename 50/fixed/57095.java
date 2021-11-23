public void actionPerformed(java.awt.event.ActionEvent e) {
    if (captureToggle) {
        ca.ubc.cs.commandrecommender.usagedata.gathering.contextwriters.ContextWriter.tsc.captureScreenContext();
    }else {
        aec.captureEditorContext();
    }
}