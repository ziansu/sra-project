@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        EuchreGame.getHuman_turn().acquire();
        if ((GameInfo.isPick) == 1) {
            switchCard(yourCard, pickOrPassCard);
        }else {
            playCard(yourCard, yourMiddleCard);
            disableCards();
        }
        EuchreGame.getButton_press().release();
    } catch (java.lang.InterruptedException e1) {
        e1.printStackTrace();
    }
}