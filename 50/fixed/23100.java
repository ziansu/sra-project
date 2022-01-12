@java.lang.Override
public void onClick(android.view.View view) {
    button9.setText(((mark) + ""));
    placeMarkOnBoard(2, 2);
    button9.setEnabled(false);
    checkForWinOrDraw();
}