public void disableObstaclesFixes(robot.CinematiqueObs obs) {
    disabledObstaclesFixes.clear();
    for (obstacles.types.ObstaclesFixes o : obstacles.types.ObstaclesFixes.values())
        if (o.getObstacle().isColliding(obs.obstacle)) {
            log.warning(("Désactivation de l'obstacle fixe :" + o));
            disabledObstaclesFixes.add(o);
        }
    
    if (!(disabledObstaclesFixes.isEmpty()))
        dstarlite.disableObstaclesFixes(obs.getPosition());
    
}