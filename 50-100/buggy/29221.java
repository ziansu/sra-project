private void resumeGame() {
    com.diusrex.tictactoe.data_structures.SectionPosition selectedSection = saverAndLoader.loadSelectedSection(board);
    if (gameStillRunning()) {
        prepareForNextMove(com.diusrex.tictactoe.android.GameActivity.getCurrentTime(), selectedSection);
    }else {
        disablePerformingMove();
        sectionSelected(selectedSection);
    }
    undoButton.setEnabled(board.ableToUndoLastMove());
}