@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    try {
        setLink(genericConnectionPanel.createLink());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}