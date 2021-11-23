public static int nextLevelId(int levelId) {
    int levelNo = pl.tlasica.firewireapp.play.LevelId.level(levelId);
    int gameNo = pl.tlasica.firewireapp.play.LevelId.game(levelId);
    if (gameNo > (pl.tlasica.firewireapp.parser.BoardLoader.levelSizes[levelNo]))
        return pl.tlasica.firewireapp.play.LevelId.levelId((levelNo + 1), 1);
    else
        return pl.tlasica.firewireapp.play.LevelId.levelId(levelNo, (gameNo + 1));
    
}