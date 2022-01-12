private void setAilevel() {
    java.lang.String[] options = new java.lang.String[]{ "Low Level" , "High Level" , "Exit" };
    int result = javax.swing.JOptionPane.showOptionDialog(null, "Please select AI level You want", "Select AI Level", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    switch (result) {
        case 2 :
        case -1 :
            java.lang.System.exit(0);
        default :
            this.aiLevel = result;
    }
}