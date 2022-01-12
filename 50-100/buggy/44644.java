private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {
    edu.psu.sweng500.team8.coreDataStructures.Puzzle.DifficultyLevel difficulty;
    if (radEasy.isSelected())
        difficulty = edu.psu.sweng500.team8.coreDataStructures.Puzzle.DifficultyLevel.Easy;
    else
        if (radMedium.isSelected())
            difficulty = edu.psu.sweng500.team8.coreDataStructures.Puzzle.DifficultyLevel.Medium;
        else
            difficulty = edu.psu.sweng500.team8.coreDataStructures.Puzzle.DifficultyLevel.Hard;
        
    
    edu.psu.sweng500.team8.coreDataStructures.Puzzle puzzle = this.puzzleRepo.getPuzzle(difficulty);
    gameSession = new edu.psu.sweng500.team8.play.GameSession(puzzle);
    this.gameBoard.populatePanel(gameSession.getGameBoard().getCellGrid(), gameSession);
}