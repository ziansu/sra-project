public void updateContent(forms.MessageNode[] messageNodes) {
    for (forms.MessageNode mn : messageNodes) {
        try {
            doc.insertString(doc.getLength(), (((mn.text1) + " : ") + (mn.text2)), null);
            textPane_chat.updateUI();
        } catch (javax.swing.text.BadLocationException e) {
        }
    }
}