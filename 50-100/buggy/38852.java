private void move(es.urjc.mov.javsan.miner.MinerGame game, es.urjc.mov.javsan.miner.Point p) {
    if (game.isFail(p)) {
        game.setLostGame();
        return ;
    }
    if ((game.getMines(p)) == 0) {
        game.empty(p);
    }else {
        game.move(p);
    }
}