private net.canarymod.api.world.position.Direction calculateTurn(net.canarymod.api.world.position.Direction d, boolean left, int deg) {
    int dirInt = d.getIntValue();
    int turns = deg / 45;
    if (left) {
        dirInt -= turns;
    }else {
        dirInt += turns;
    }
    dirInt = dirInt % 8;
    d = net.canarymod.api.world.position.Direction.getFromIntValue(dirInt);
    return d;
}