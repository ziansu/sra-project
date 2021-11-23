@java.lang.Override
public void onClick(android.view.View view) {
    button1.setText(((mark) + ""));
    placeMarkOnBoard(0, 0);
    button1.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}