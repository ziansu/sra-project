public void actionPerformed(java.awt.event.ActionEvent arg0) {
    generator.GenerateList(targetFileField.getText(), ((int) (minLengthField.getValue())), ((int) (maxLengthField.getValue())), ((int) (linePerFileField.getValue())), charset);
}