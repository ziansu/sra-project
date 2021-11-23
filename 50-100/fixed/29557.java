private com.alchera.game.Structure.Managers.Scene getScene(com.alchera.game.Structure.Managers.SceneManager.SceneType type) {
    switch (type) {
        case SPLASH :
            return new com.alchera.game.Structure.Managers.SplashScene(this);
        case MAINMENU :
            return new com.alchera.game.Structure.Managers.MainMenu(this);
        case GAMEPLAY :
            return new com.alchera.game.Structure.Managers.GameplayScene(this);
        case CREDITS :
            return new com.alchera.game.Structure.Managers.CreditsScene(this);
    }
    return null;
}