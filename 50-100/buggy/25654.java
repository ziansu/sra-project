@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int x = jDialog.getX();
    x = x - 10;
    if (x < (xEnd)) {
        x = xEnd;
        fadeIn.stop();
        fadeIn = null;
    }
    jDialog.setLocation(x, y);
}