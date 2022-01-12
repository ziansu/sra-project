@java.lang.Override
public void focusLost(java.awt.event.FocusEvent e) {
    if (((editObj.sDescription) == null) || (!(editObj.sDescription.equals(jTextDesc.getText())))) {
        editObj.sDescription = jTextDesc.getText().trim();
        FireObjectModified();
    }
}