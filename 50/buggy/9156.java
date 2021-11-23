private void useAlleleQualityCBActionPerformed(java.awt.event.ActionEvent e) {
    updatedPreferenceMap.put(PreferenceManager.SAM_ALLELE_USE_QUALITY, java.lang.String.valueOf(useAlleleQualityCB.isSelected()));
    this.updateCoverageTrack = true;
}