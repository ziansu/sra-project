@java.lang.Override
public void onClick(android.view.View view) {
    button5.setText(((mark) + ""));
    placeMarkOnBoard(1, 1);
    button5.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}