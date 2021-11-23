@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    calendar = calendar.getInstance();
    clock.setText(("" + (calendar.getTime())));
    clock.repaint();
}