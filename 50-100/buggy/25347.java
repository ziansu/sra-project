public void itemStateChanged(java.awt.event.ItemEvent arg0) {
    java.lang.String fansubName = ((java.lang.String) (util.window.AnimeInformation.fansubComboBox.getSelectedItem()));
    if ((fansubName != null) && (!(fansubName.isEmpty()))) {
        java.lang.String link = AnimeIndex.fansubMap.get(fansubName);
        if ((link != null) && (!(link.isEmpty()))) {
            fansubButton.setEnabled(true);
        }else
            fansubButton.setEnabled(false);
        
    }
}