private void writeToTextAreaRight(java.io.File textFile) {
    try {
        java.io.FileReader fr = new java.io.FileReader(textFile);
        java.io.BufferedReader br = new java.io.BufferedReader(fr);
        textAreaRight.setText("");
        textAreaRight.read(br, null);
        highlightLeftAreaLines();
        br.close();
        fr.close();
    } catch (java.lang.Exception e2) {
        javax.swing.JOptionPane.showMessageDialog(primaryWindow, e2.getMessage());
    }
}