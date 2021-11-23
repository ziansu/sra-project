@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    java.lang.Object source = ae.getSource();
    if (source instanceof javax.swing.JButton) {
        if ((frame.isActive()) && ((((javax.swing.JButton) (source)).getText()) == "Start")) {
            this.frame.setState(javax.swing.JFrame.ICONIFIED);
            ((javax.swing.JButton) (source)).setText("Pause");
            new java.lang.Thread(this.frame.tracker).start();
        }
    }
}