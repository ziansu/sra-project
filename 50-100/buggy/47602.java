public static void Updatep() throws java.io.IOException {
    int pane = javax.swing.JOptionPane.showConfirmDialog(null, (("Update is available, Would you like to update to version " + (com.Jessy1237.renamer.Update.version)) + "?"), "Minecraft Version Switcher", javax.swing.JOptionPane.YES_NO_OPTION);
    if (pane == 0) {
        dLoadJars.v = "McVS";
        com.Jessy1237.renamer.Download p = new com.Jessy1237.renamer.Download();
        p.setVisible(true);
        javax.swing.JOptionPane.showMessageDialog(null, "Finished downloading the update, Delete this version and use the new one on your desktop.", "Minecraft Versions Switcher", 1);
    }
}