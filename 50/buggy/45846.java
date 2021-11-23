@java.lang.Override
public void onClick(android.view.View view) {
    button8.setText(((mark) + ""));
    placeMarkOnBoard(2, 1);
    button8.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}