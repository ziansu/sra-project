public void windowClosing(java.awt.event.WindowEvent e) {
    try {
        p.savePreferences();
    } catch (java.io.IOException ex) {
        java.lang.System.out.println(("Couldn't save preferences: " + ex));
    }
    java.lang.System.exit(0);
}