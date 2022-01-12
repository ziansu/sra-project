@java.lang.Override
public void actionPerformed(final java.awt.event.ActionEvent evt) {
    final java.lang.String s = ((java.lang.String) (javax.swing.JOptionPane.showInputDialog(rootPane, "Enter the header for a new property")));
    if ((s != null) && (!("".equals(s)))) {
        final org.diyefi.openlogviewer.propertypanel.SingleProperty newprop = new org.diyefi.openlogviewer.propertypanel.SingleProperty();
        newprop.setHeader(s);
        addProperty(newprop);
    }
}