public void disableObstaclesFixes(utils.Vec2RO position) {
    grilleStatiqueModif.clear();
    grilleStatiqueModif.or(grilleStatique);
    for (int i = 0; i < (PointGridSpace.NB_POINTS); i++)
        if ((pointManager.get(i).computeVec2().distanceFast(position)) < (rayonRobotObstaclesFixes))
            grilleStatiqueModif.clear(i);
        
    
}