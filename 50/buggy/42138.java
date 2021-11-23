@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    move();
    checkEatFood();
    checkHitWall();
    checkHitSelf();
    panel.refresh();
}