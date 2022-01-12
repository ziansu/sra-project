public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    excludeButton.setEnabled(false);
    includeButton.setEnabled(true);
    if (searchBarExclusions.getText().isEmpty())
        selectedAnime = ((java.lang.String) (listToExclude.getSelectedValue()));
    else
        selectedAnime = ((java.lang.String) (searchListToExclude.getSelectedValue()));
    
    if ((selectedAnime) != null)
        getExclusionFields(selectedAnime);
    
}