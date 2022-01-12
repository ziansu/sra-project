private megamek.common.IGame getGame() {
    GAME_LOCK.lock();
    try {
        getOwner().log(getClass(), "getGame()", LogLevel.DEBUG, "GAME_LOCK read locked.");
        return game;
    } finally {
        GAME_LOCK.unlock();
        getOwner().log(getClass(), "getGame()", LogLevel.DEBUG, "GAME_LOCK read unlocked.");
    }
}