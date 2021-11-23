@java.lang.Override
public void focusLost(java.awt.event.FocusEvent e) {
    if (((editObj.sLicense) == null) || (!(editObj.sLicense.equals(jTextDesc.getText())))) {
        editObj.sDescription = jTextDesc.getText().trim();
        FireObjectModified();
    }
}