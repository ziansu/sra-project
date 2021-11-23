public void repath() {
    if (active) {
        java.awt.Point dest = areaTraveled.get(((areaTraveled.size()) - 1));
        areaTraveled = solenus.gridemblem3.scene.mapscene.Pathfinding.repath(dest, movingUnit, pr.getDistanceMap());
    }
    reweight();
    repathFlag = false;
}