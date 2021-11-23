private int createSandbag(game.WorldContainer wc) {
    float radius = 32;
    int sandbag = wc.createEntity();
    wc.addComponent(sandbag, new game.PositionComp(500, 300));
    wc.addComponent(sandbag, new game.ColoredMeshComp(game.ColoredMeshUtils.createCircleMulticolor(radius, 16)));
    wc.addComponent(sandbag, new game.PhysicsComp());
    return sandbag;
}