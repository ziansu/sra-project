@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    setVisible(false);
    lk.ac.mrt.cse.RegWindow regWindow = new lk.ac.mrt.cse.RegWindow(node);
    regWindow.setLocation(x(), y());
    regWindow.setVisible(true);
}