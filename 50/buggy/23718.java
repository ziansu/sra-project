@java.lang.Override
public void applyChanges() {
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            getPanel().store();
            changed = false;
        }
    });
}