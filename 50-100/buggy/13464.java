public edu.chalmers.vaporwave.view.Sprite getSprite(edu.chalmers.vaporwave.model.Player p) {
    switch (p.getCharacter().getName().toUpperCase(java.util.Locale.ENGLISH)) {
        case "ZYPHER" :
            winnerSprite = java.awt.Container.getSprite(SpriteID.MENU_RESULTS_ZYPHER);
            break;
        case "ALYSSA" :
            winnerSprite = java.awt.Container.getSprite(SpriteID.MENU_RESULTS_ALYSSA);
            break;
        case "MEI" :
            winnerSprite = java.awt.Container.getSprite(SpriteID.MENU_RESULTS_MEI);
            break;
        case "CHARLOTTE" :
            winnerSprite = java.awt.Container.getSprite(SpriteID.MENU_RESULTS_CHARLOTTE);
            break;
        default :
            winnerSprite = java.awt.Container.getSprite(SpriteID.MENU_RESULTS_ALYSSA);
    }
    return winnerSprite;
}