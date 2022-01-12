public void run() {
    com.cubicb.ssm.game.Stock.timer(p);
    com.cubicb.ssm.game.Stock.addRespawnTime(p, (-1.0));
    if ((com.cubicb.ssm.game.Stock.getRespawnTime(p)) <= 0.0) {
        com.cubicb.ssm.game.Stock.revive(p);
        cancel();
    }
}