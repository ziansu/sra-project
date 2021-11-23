public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String typingWord = textField.getText().trim().toLowerCase();
    if (!(typingWord.equals(""))) {
        java.lang.String result = dict.search(typingWord);
        if (result != null) {
            wordList.setSelectedValue(typingWord, true);
            wordList.requestFocus();
        }else {
            meaningEditorPane.setText("<font color=\"red\">Not found!</font>");
        }
    }
}