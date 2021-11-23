public boolean useSwitch(level.maps.Level level, int x, int y, entity.mobs.Mob user) {
    if ((counterId) == (-1))
        return false;
    
    level.setObject(x, y, counterId);
    return true;
}