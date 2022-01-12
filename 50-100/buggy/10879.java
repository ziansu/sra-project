private java.lang.String findWordInRow(int rowNumber) {
    javax.swing.JPanel panel = panels.get(rowNumber);
    javax.swing.JTextArea textArea = new javax.swing.JTextArea();
    try {
        textArea = ((javax.swing.JTextArea) (rowsCreator.findElementInsideOrCreate(panel, javax.swing.JTextArea.class)));
    } catch (java.lang.ClassNotFoundException | java.lang.InstantiationException | java.lang.IllegalAccessException e) {
        sendErrorToParent(e);
    }
    return textArea.getText();
}