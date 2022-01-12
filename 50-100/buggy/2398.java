private static amt.main.levels.Entity entityFromWord(java.lang.String word, int x, int y, amt.main.Handler handler) {
    switch (word) {
        case "Player" :
            return new amt.main.levels.Player(10, 0.06F, x, y, handler);
        case "Turret" :
            return new amt.main.levels.Turret(x, y, handler);
        case "Rusher" :
            return new amt.main.levels.Rusher(x, y, handler);
        default :
            java.lang.System.err.println((("LevelLoader doesn\'t know what Entity \"" + word) + "\" is."));
            return null;
    }
}