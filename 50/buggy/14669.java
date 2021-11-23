private void initializeWorld() {
    my.games.geometry.game.objects.GameObject obst = createGameObject("static", new my.games.geometry.game.engine.ObjectPosition(250, 50), 0.0);
    obst.addOnHitEffect(new my.games.geometry.behaviour.BumpEffect(0));
}