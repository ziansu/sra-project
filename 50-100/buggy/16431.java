public net.canarymod.api.world.position.Direction turn(net.canarymod.api.world.position.Direction d, boolean left, int deg) {
    int dirInt = d.getIntValue();
    if (deg != 0) {
        if (left) {
            dirInt -= 2;
        }else {
            dirInt += 2;
        }
    }else {
        int turns = deg / 45;
        if (left) {
            dirInt -= turns;
        }else {
            dirInt += turns;
        }
    }
    dirInt = (dirInt + 4) % 8;
    d = net.canarymod.api.world.position.Direction.getFromIntValue(dirInt);
    return d;
}