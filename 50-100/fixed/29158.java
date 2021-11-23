public int firstUnfinishedLevelId() {
    for (int level = 1; level <= (pl.tlasica.firewire.parser.BoardLoader.NUM_LEVELS); level++) {
        for (int game = 1; game <= (pl.tlasica.firewire.parser.BoardLoader.levelSizes[level]); game++) {
            int levelId = pl.tlasica.firewire.play.LevelId.levelId(level, game);
            if (!(levelsSolved.contains(levelId)))
                return levelId;
            
        }
    }
    return 0;
}