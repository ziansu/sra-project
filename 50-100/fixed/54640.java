public void saveFile() {
    try {
        if (((selectedFile) == null) || (textArea.getText().equals(""))) {
            saveAs();
        }else {
            java.io.PrintWriter writer = new java.io.PrintWriter(selectedFile);
            writer.print(textArea.getText());
            writer.flush();
        }
    } catch (java.io.FileNotFoundException ex) {
    }
}