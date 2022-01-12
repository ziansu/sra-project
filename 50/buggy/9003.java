@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((player.getTurn()) && (!(P1hasDrawnCard))) {
        player.DrawFromDD();
    }
}