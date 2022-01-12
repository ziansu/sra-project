protected static final void check(final com.gamesbykevin.breakout.game.Game game) {
    if ((game.getBricks().getCount()) <= 0) {
        com.gamesbykevin.breakout.game.GameHelper.FRAMES = 0;
        com.gamesbykevin.breakout.game.GameHelper.WIN = true;
        game.getScreen().setState(ScreenManager.State.GameOver);
    }else
        if (game.getBalls().getBalls().isEmpty()) {
            com.gamesbykevin.breakout.game.GameHelper.FRAMES = 0;
            com.gamesbykevin.breakout.game.GameHelper.LOSE = true;
            (com.gamesbykevin.breakout.game.GameHelper.LIVES)--;
        }
    
}