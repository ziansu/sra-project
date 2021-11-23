public void cleanAddStage() {
    profileTextF.setText(null);
    portableCheck.setSelected(false);
    portableCombo.setDisable(true);
    destDirLabel.setText(com.github.palmeidaprog.nomad.main.StringResources.getDestDirLabel());
    foldersList.clear();
}