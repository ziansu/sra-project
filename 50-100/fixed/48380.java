@java.lang.Override
public void onClick(android.view.View v) {
    if ((com.teleco.psi.battleship.GameActivity.matrixMachine[(i - 1)][(j - 1)][0]) == 1) {
        view.setBackgroundColor(Color.RED);
        return ;
    }else {
        view.setBackgroundColor(Color.BLUE);
    }
    com.teleco.psi.battleship.GameActivity.IATurn = true;
    com.teleco.psi.battleship.GameActivity.humanTurn = false;
    com.teleco.psi.battleship.GameActivity.startAlgorithm();
}