public no.dkit.android.ludum.core.game.model.world.level.Level nextLevel(no.dkit.android.ludum.core.game.model.world.level.Level.LEVEL_TYPE levelType) {
    if ((no.dkit.android.ludum.core.game.factory.LevelFactory.level) < (no.dkit.android.ludum.core.game.Config.MAX_LEVEL))
        (no.dkit.android.ludum.core.game.factory.LevelFactory.level)++;
    else
        no.dkit.android.ludum.core.game.factory.LevelFactory.level = 1;
    
    try {
        currentLevel = createLevel(levelType);
    } catch (java.lang.Exception e) {
        currentLevel = nextLevel(levelType);
    }
    java.lang.System.out.println(("currentLevel = " + (currentLevel)));
    return currentLevel;
}