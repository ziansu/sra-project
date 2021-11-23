private void initArtifactsVersion() {
    teiidV6Artifacts = getRadioButton(qe.panels.SettingsPanel.TEIID_TEST_ARTIFACTS_V6, true, saveTeiidV6ArtifactsSelectedAction);
    teiidArtifacts = getRadioButton(qe.panels.SettingsPanel.TEIID_TEST_ARTIFACTS, false, saveTeiidArtifactsSelectedAction);
    javax.swing.ButtonGroup bg = new javax.swing.ButtonGroup();
    bg.add(teiidArtifacts);
    bg.add(teiidV6Artifacts);
}