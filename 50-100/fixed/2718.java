public void initStatesList(org.newdawn.slick.GameContainer gc) throws org.newdawn.slick.SlickException {
    this.addState(new game.MainMenuState());
    this.addState(new game.LevelState());
    this.addState(new game.PauseMenuState());
    this.addState(new game.SettingsMenuState());
    this.addState(new game.VolumeMenuState());
    this.addState(new game.ControlsMenuState());
    this.addState(new game.LevelSelectMenuState());
    this.enterState(0);
}