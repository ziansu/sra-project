private void performAction() {
    if (game.doAction(actual, fx, fy, tx, ty)) {
        currentAction.setText("Success!");
        actual = ((actual) == (game.getPlayer1())) ? game.getPlayer2() : actual;
    }else {
        currentAction.setText("Invalid action, please try again");
    }
    fx = -1;
    fy = -1;
    tx = -1;
    ty = -1;
    updateBoard();
}