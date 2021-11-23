@java.lang.Override
public void doTurn(bots.PirateGame game) {
    if (firstTurn(game))
        initFirstTurn();
    
    history.update(game);
    decideStrategy(game).doTurn(history);
}