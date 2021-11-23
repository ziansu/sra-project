public void markAsFinished(int level, int chapter) {
    if ((level == (getCurrentLevel(chapter))) && (level <= (sokobug.screens.ChooseLevelScreen.NUMBER_OF_LEVELS))) {
        levelsStatus[(chapter - 1)][level] = sokobug.domain.PlayerProgress.LevelType.OPENED_LEVEL.ordinal();
    }else {
        levelsStatus[(chapter - 1)][(level - 1)] = sokobug.domain.PlayerProgress.LevelType.OPENED_LEVEL.ordinal();
    }
}