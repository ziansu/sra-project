@java.lang.Override
public boolean isDone(core.game.Game game) {
    boolean ended = super.isFinished(game);
    if (ended)
        return true;
    
    if ((((itype) == (-1)) && (((game.getNumSprites(itype)) - (game.getNumDisabledSprites(itype))) <= (limit))) && (canEnd)) {
        countScore(game);
        return true;
    }
    return false;
}