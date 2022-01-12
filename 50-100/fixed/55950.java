private void removeCyclePrint() {
    javax.swing.text.Document doc = null;
    if (doc == null) {
        doc = logTextArea.getDocument();
    }
    try {
        doc.remove(((doc.getLength()) - (cycle[index].length())), cycle[index].length());
    } catch (javax.swing.text.BadLocationException ex) {
    }
}