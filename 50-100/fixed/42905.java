@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    btnNext.setEnabled(false);
    (monopolyalpha.Board.counter)++;
    if ((monopolyalpha.Board.counter) == 5) {
        comCard.setVisible(false);
        comCard.dispose();
        commCheck(ind, roll);
        btnNext.setEnabled(true);
        monopolyalpha.Board.timer.stop();
    }
}