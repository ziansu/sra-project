private static void finalizeResults(game.Board[] boards) {
    game.Game.marcAverageScore = (game.Game.marcTotalScore) / (((boards.length) - (game.Game.tieGames)) / 2);
    game.Game.marcAverageBeatingPoints = (game.Game.marcTotalBeatingPoints) / (game.Game.marcWins);
    game.Game.julianAverageScore = (game.Game.julianTotalScore) / (((boards.length) - (game.Game.tieGames)) / 2);
    game.Game.julianAverageBeatingPoints = (game.Game.julianTotalBeatingPoints) / (game.Game.julianWins);
}