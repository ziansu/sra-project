public void repath(java.awt.Point dest) {
    if (active) {
        areaTraveled = solenus.gridemblem3.scene.mapscene.Pathfinding.repath(dest, movingUnit, pr.getDistanceMap(), false);
    }
    weight = pr.getDistanceTo(areaTraveled.get(((areaTraveled.size()) - 1)));
    repathFlag = false;
}