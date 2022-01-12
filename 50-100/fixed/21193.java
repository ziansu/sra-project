@java.lang.Override
public void screenChanged(edu.chl.proximity.Controllers.ScreenChanger.ScreenChanger.ScreenType newScreen) {
    switch (newScreen) {
        case MainMenu :
            game.setScreen(new edu.chl.proximity.Controllers.GameStates.MenuScreen(game, edu.chl.proximity.Models.Player.Players.GameData.getInstance().getPlayer(), viewport));
            break;
        case GameOver :
            game.setScreen(new edu.chl.proximity.Controllers.GameStates.GameOverScreen(game, map, edu.chl.proximity.Models.Player.Players.GameData.getInstance().getPlayer(), viewport));
            break;
        default :
            break;
    }
}