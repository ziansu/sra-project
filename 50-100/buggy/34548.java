public void editorChanged(java.lang.String newText, java.lang.String source) {
    java.lang.System.out.println(newText);
    switch (source) {
        case "entry" :
            ((com.nlbuescher.dictionarywriter.dictionary.D_entry) (treeView.getSelectionModel().getSelectedItem().getValue())).setEntryText(newText);
            updatePreview(treeView.getSelectionModel().getSelectedItem());
            break;
        case "index" :
            ((com.nlbuescher.dictionarywriter.dictionary.D_entry) (treeView.getSelectionModel().getSelectedItem().getValue())).setIndexText(newText);
            break;
    }
}