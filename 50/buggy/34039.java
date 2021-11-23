@java.lang.Override
public void doTurn(bots.PirateGame game) {
    if (firstTurn())
        initFirstTurn();
    
    history.update(game);
    strategy = decideStrategy().doTurn(history);
}