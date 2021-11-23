private void startGame() {
    if ((game.getState()) == (es.ucm.fdi.tp.basecode.bgame.model.Game.State.Starting))
        game.start(pieces);
    else
        game.restart();
    
}