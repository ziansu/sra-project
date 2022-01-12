@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    super.clicked(event, x, y);
    com.quickbite.connector2.gui.MainMenuGUI.checkAllOptionsSelected();
    com.quickbite.connector2.GameSettings.gameType = GameSettings.GameType.Practice;
    com.quickbite.connector2.gui.MainMenuGUI.changeChoices(GameSettings.GameType.Practice);
    com.quickbite.connector2.SoundManager.playSound("click");
}