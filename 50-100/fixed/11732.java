private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
    java.util.ArrayList<java.awt.Point> roiData = util.DataManager.readRoiFile(chosenPath);
    if (roiData != null) {
        if ((roiData.size()) > 0) {
            setFields();
            notifyRoiListeners(roiData);
            if (defaultCheckBox.isSelected()) {
                notifyRoiListeners(chosenPath);
            }
            this.setVisible(false);
        }else {
            errorText.setText("Error loading: File not found!");
        }
    }
}