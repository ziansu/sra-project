private java.lang.String getSystemName(java.lang.String systemID) {
    java.lang.String systemName;
    java.lang.String message = "Enter the name for " + systemID;
    systemName = javax.swing.JOptionPane.showInputDialog(null, message);
    EFBOUserInterfaceManager.progressBar.setValue(10);
    java.lang.System.out.println(("System ID: " + systemID));
    java.lang.System.out.println(("Name : " + systemName));
    return systemName;
}