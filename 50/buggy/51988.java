private void deleteMenuItemAction() {
    javax.swing.JList<com.tkomiya.models.VocabList> links = mainView.getLinks();
    int index = links.getSelectedIndex();
    vocabLists.remove(index);
    mainView.removeLink(index);
}