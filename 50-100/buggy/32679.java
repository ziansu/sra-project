@org.jdesktop.application.Action
public void autoDetectFileCoding() throws java.io.IOException {
    java.lang.String encoding = canreg.common.Tools.detectCharacterCodingOfFile(fileNameTextField.getText());
    if (encoding != null) {
        java.nio.charset.Charset charset = java.nio.charset.Charset.forName(encoding);
        charsetsComboBox.setSelectedItem(charset);
    }else {
        java.lang.System.out.println("No encoding detected.");
    }
    return ;
}