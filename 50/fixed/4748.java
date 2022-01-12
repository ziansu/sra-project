public void actionPerformed(java.awt.event.ActionEvent e) {
    if (isConnected)
        new com.umenprosthesis.umen.core.DebugDialog(serialCom, true);
    else
        javax.swing.JOptionPane.showMessageDialog(null, "Please plug you hardware and select a communication port.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    
}