public void actionPerformed(java.awt.event.ActionEvent arg0) {
    generator.GenerateList(((int) (minLengthField.getValue())), ((int) (maxLengthField.getValue())), ((int) (linePerFileField.getValue())), targetFileField.getText(), charset);
}