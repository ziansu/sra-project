@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (inGame) {
        timerTickCount += 1;
        if ((((timerTickCount) % 200) == 0) && ((DELAY) > 87)) {
            timer.stop();
            this.DELAY -= 1;
            timer = new javax.swing.Timer(DELAY, this);
            timer.start();
        }
        java.lang.System.out.println(((timerTickCount) + "    game is running"));
        Controller.GameOne.getInstance().move(direction, timerTickCount);
    }
    repaint();
}