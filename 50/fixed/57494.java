void allowTyping(final boolean allowed) {
    javax.swing.SwingUtilities.invokeLater(() -> {
        inputField.setEditable(allowed);
        sendButton.setEnabled(allowed);
        shareFileButton.setEnabled(allowed);
    });
}