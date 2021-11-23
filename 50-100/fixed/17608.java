private void updateInfoPanel(java.lang.String updatedText) {
    if ((infoText.getText().length()) > 0) {
        infoText.append("\n");
    }
    infoText.append(updatedText);
    infoText.setCaretPosition(infoText.getDocument().getLength());
}