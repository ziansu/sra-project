@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.io.File file = com.clarkparsia.sbol.SBOLUtils.importFile();
    if (file != null) {
        locationField.setText(file.getPath());
    }
}