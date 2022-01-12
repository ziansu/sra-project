public static void main(java.lang.String[] args) {
    nl.edu.avans.ivp4c2.manager.BarManager barmanager = new nl.edu.avans.ivp4c2.manager.BarManager();
    nl.edu.avans.ivp4c2.manager.LoginManager loginmanager = new nl.edu.avans.ivp4c2.manager.LoginManager();
    final javax.swing.JFrame frame = new nl.edu.avans.ivp4c2.presentation.BarGUIFrame(barmanager);
    frame.addWindowListener(new java.awt.event.WindowAdapter() {
        @java.lang.Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            if ((javax.swing.JOptionPane.showConfirmDialog(frame, "Weet u zeker dat u de applicatie wilt sluiten?", "Applicatie afsluiten?", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE)) == (javax.swing.JOptionPane.YES_OPTION)) {
                java.lang.System.exit(0);
            }
        }
    });
}