public void interactBullet(model.game.Bullet bullet) {
    model.game.Replicator replicator = model.game.ReplicatorContainer.getReplicator(this);
    if (replicator != null) {
        replicator.die();
    }else {
        gate = bullet.createStarGate();
        model.game.Wormhole.setSpecWall(this, gate.getColor());
    }
    bullet.die();
    if (!(walkable)) {
        walkable = true;
    }
}