public void update(long elapsedTime, java.util.Map<java.lang.Integer, fr.univavignon.courbes.common.Direction> commands) {
    if ((invincibleTime) > 0)
        invincibleTime -= elapsedTime;
    
    majSnakesPositions(elapsedTime);
    majSnakesDirections(elapsedTime, commands);
    majSnakesEffects(elapsedTime);
    majSpawnItem(elapsedTime);
}