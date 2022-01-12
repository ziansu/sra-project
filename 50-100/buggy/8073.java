private gov.anl.ipns.ViewTools.Components.ViewControls.CompositeContourControl generateContourControls(float minValue, float maxValue, int numLevels, float[] levels, boolean showManualControls) {
    contourControl = new gov.anl.ipns.ViewTools.Components.ViewControls.CompositeContourControl(getContourPanel(), minValue, maxValue, numLevels, levels, false);
    contourControl.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent event) {
            if (event.getActionCommand().equals(CompositeContourControl.CONTOURS_CHANGED))
                displayChanged();
            
        }
    });
    return contourControl;
}