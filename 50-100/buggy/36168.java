void jComboBoxClassification_actionPerformed(java.awt.event.ActionEvent event) {
    int selectedIndex = jComboBoxClassification.getSelectedIndex();
    if (selectedIndex == ((jComboBoxClassification.getItemCount()) - 1)) {
        jComboBoxClassification.hidePopup();
        this.parentDialog.setVisible(false);
        JPanelForm.instance.manageLocalClassifications();
    }else {
        prevSelectedClassifIndex = selectedIndex;
        updateCurrentSelectedClassif();
    }
}