@java.lang.SuppressWarnings(value = "unused")
public void editorChanged(java.lang.String newText, java.lang.String source) {
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