@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (isEmpty(number)) {
        buttons.get(number).setIcon(iconX);
        weightField[((number) % 3)][((number) / 3)] = X;
        if (!(isWin(X))) {
            turnAI();
        }else {
            trueWinner(X);
        }
    }
}