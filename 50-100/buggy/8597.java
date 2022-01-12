@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int x = jDialog.getX();
    x = x + 10;
    if (x > (xStart)) {
        x = xStart;
        fadeOut.stop();
        jDialog.setVisible(false);
    }
    jDialog.setLocation(x, y);
}