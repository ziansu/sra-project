@java.lang.Override
public void onClick(android.view.View view) {
    button2.setText(((mark) + ""));
    placeMarkOnBoard(0, 1);
    button2.setEnabled(false);
    checkForWinOrDraw();
}