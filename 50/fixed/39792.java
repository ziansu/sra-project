private boolean updateBoard() {
    java.awt.Dimension size = getSize();
    java.lang.System.out.println(size);
    setupGoal(size);
    updateScore();
    player.addSegment();
    statusbar.setText(java.lang.String.valueOf(score));
    return true;
}