@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    setEnabled(((savePairTextFile.isSelected()) || (saveTrackSummaryFile.isSelected())), fileComps);
    prefs_.putBoolean(edu.valelab.gaussianfit.PairDisplayForm.SAVEPAIRTEXTFILEPREF, savePairTextFile.isSelected());
}