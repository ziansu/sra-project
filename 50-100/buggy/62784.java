private void profilesjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
    project.getPhotoSeries().clear();
    de.quadrillenschule.azocamsyncd.astromode.PhotoProjectProfile ppp = ((de.quadrillenschule.azocamsyncd.astromode.PhotoProjectProfile) (profilesjComboBox.getSelectedItem()));
    project.getPhotoSeries().addAll(ppp.getPhotoSeries());
    for (de.quadrillenschule.azocamsyncd.astromode.PhotoSerie ps : project.getPhotoSeries()) {
        ps.setProject(project);
    }
    profileNamejTextField.setText(ppp.toString());
    tableDataChanged();
}