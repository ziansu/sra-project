public static game.character.Cast getInstance() {
    if ((game.character.Cast.cast) != null) {
        game.character.Cast.logging.info("cast returned");
        return game.character.Cast.cast;
    }else {
        synchronized(game.character.Cast.class) {
            if ((game.character.Cast.cast) == null) {
                game.character.Cast.logging.info("New cast created");
                game.character.Cast.cast = new game.character.Cast();
            }
        }
    }
    return game.character.Cast.cast;
}