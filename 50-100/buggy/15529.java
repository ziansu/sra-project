@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    java.lang.String selectedWord = wordList.getSelectedValue();
    java.lang.String result = dict.search(selectedWord);
    if (result != null) {
        meaningEditorPane.setText(((("<b>" + selectedWord) + "</b><br/>") + (dict.search(selectedWord))));
    }else {
        meaningEditorPane.setText("<font color=\"red\">Not found!</font>");
    }
}