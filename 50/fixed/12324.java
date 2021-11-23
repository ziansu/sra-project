@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    calendar = java.util.Calendar.getInstance();
    clock.setText(("" + (calendar.getTime())));
    clock.repaint();
}