public void run() {
    com.cubicb.ssm.game.Stock.timer(p);
    if ((com.cubicb.ssm.game.Stock.getRespawnTime(p)) <= 0) {
        com.cubicb.ssm.game.Stock.timer(p);
        com.cubicb.ssm.game.Stock.revive(p);
        cancel();
    }
    com.cubicb.ssm.game.Stock.addRespawnTime(p, (-1));
}