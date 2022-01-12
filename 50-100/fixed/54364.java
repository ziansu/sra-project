@java.lang.Override
public void onClick(android.view.View view) {
    gameBoard.setTestGame(java.lang.Integer.parseInt(btnDebug.getText().toString()));
    imgBoard.redrawBoard();
    imgBoard.updateSpinnerChoices();
    android.widget.Button bMove = ((android.widget.Button) (findViewById(R.id.bMove)));
    bMove.setEnabled(true);
}