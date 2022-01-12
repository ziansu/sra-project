public void handleKeyTyped(java.awt.event.KeyEvent e, boolean problematicCheckboxSelected, int rowNumber) {
    if ((e.getKeyChar()) == 'p') {
        e.consume();
    }else
        if ((e.getKeyChar()) == (java.awt.event.KeyEvent.VK_ENTER)) {
            validateAndStart(problematicCheckboxSelected);
        }else
            if (!(((e.getKeyChar()) + "").matches("\\d"))) {
                e.consume();
                learningStartPanel.showErrorIfNotExists(ExceptionsMessages.valueIsNotNumber, rowNumber);
            }
        
    
}