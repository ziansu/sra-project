public void loadGameFromFile() {
    hasMadeUIChoice = true;
    game = new edu.cpp.cs.cs141.final_project.Game();
    loadGameData();
    UI.createGrid(Game.GAME_ROWS, Game.GAME_COLS);
    redrawUI();
    paused = false;
}