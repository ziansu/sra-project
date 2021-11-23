private void resumeGame() {
    com.diusrex.tictactoe.data_structures.SectionPosition selectedSection = saverAndLoader.loadSelectedSection(board);
    if (gameStillRunning()) {
        prepareForNextMove(com.diusrex.tictactoe.android.GameActivity.getCurrentTime(), selectedSection);
    }else {
        sectionSelected(selectedSection);
        disablePerformingMove();
    }
    undoButton.setEnabled(board.ableToUndoLastMove());
}