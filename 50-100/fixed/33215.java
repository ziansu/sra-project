private void deleteTagNameButtonActionPerformed(java.awt.event.ActionEvent evt) {
    org.sleuthkit.autopsy.casemodule.services.TagsManagerOptionsPanel.CustomTagName tagName = tagNamesList.getSelectedValue();
    if (tagName != null) {
        tagNames.remove(tagName);
        updateTagNamesListModel();
        if (!(tagNamesListModel.isEmpty())) {
            tagNamesList.setSelectedIndex(0);
        }
        firePropertyChange(OptionsPanelController.PROP_CHANGED, null, null);
    }
}