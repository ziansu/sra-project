public void saveGameData() {
    edu.cpp.cs.cs141.final_project.Utilities.SaveFileManager.save(game.getActiveEntities());
    UI.setAlertText("Game saved to file.");
    UI.update();
}