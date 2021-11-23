@java.lang.Override
public void onClick(android.view.View view) {
    button6.setText(((mark) + ""));
    placeMarkOnBoard(1, 2);
    button6.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}